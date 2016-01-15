package com.TYYJ.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.TYYJ.common.RedisClient;

/**
 * Hello world!
 *
 */
@Controller
@RequestMapping("hello")
public class App 
{
    @RequestMapping(value="/getkey", 
    		method=RequestMethod.GET,
    		//headers="Accept=text/plain",
    		produces="text/plain;charset=utf-8"
    		)
    public @ResponseBody String getKey(@RequestParam String key){
    	return getValue(key);
    }
    
    @RequestMapping(value="/setkey", 
    		method=RequestMethod.GET,
    		//headers="Accept=text/plain",
    		produces="text/plain;charset=utf-8")
    public @ResponseBody String setKey(@RequestParam String key,
    		@RequestParam String value){
    	return setKeyValue(key,value);
    }
    
    private String setKeyValue(String key,String value) {
		return redisClient.getClient().set(key, value);
	}

	@Autowired
    RedisClient redisClient;
    
    private String getValue(String key){
    	redisClient.getClient().set("key", "hel"
    			+ "lo");
    	return redisClient.getClient().get(key);
    }
    
    @Autowired
    UserDAOImpl userDao;
    
    @RequestMapping(value="/saveuser", 
    		method=RequestMethod.GET,
    		//headers="Accept=text/plain",
    		produces="text/plain;charset=utf-8")
    public @ResponseBody String saveUser(@RequestParam String username,
    		@RequestParam String userid){
    	User user = new User();
    	user.setId(userid);
    	user.setName(username);
    	userDao.saveUser(user);
    	return "true";
    }
    
    @RequestMapping(value="/getuser", 
    		method=RequestMethod.GET,
    		//headers="Accept=text/plain",
    		produces="text/plain;charset=utf-8")
    public @ResponseBody String getUser(
    		@RequestParam String userid){
    	
    	User user = userDao.getUser(userid);
    	return "true";
    }
    
}

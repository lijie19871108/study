package com.TYYJ.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyyj.db.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userServie;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public @ResponseBody String login(@RequestParam String userName, @RequestParam String password){
		try {
			if(userServie.login(userName, password)){
				return "login successed!";
			}
			else{
				return "login error!";
			}
		} catch (Exception e) {
			// TODO: handle exception
			return "login error:"+e.getMessage();
		}
	}
	
	@RequestMapping(value="/regist",method=RequestMethod.GET)
	public @ResponseBody String regist(@RequestParam String userName, @RequestParam String password){
		if(userServie.regist(userName, password)){
			return "regist successed!";
		}
		else{
			return "regist failed!";
		}
	}
	
}

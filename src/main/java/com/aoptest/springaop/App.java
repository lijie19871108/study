package com.aoptest.springaop;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Component
@RequestMapping("/hello")
public class App 
{
    @RequestMapping(value="/hello")
    public @ResponseBody String hello(){
    	return "hello world!";
    }
}

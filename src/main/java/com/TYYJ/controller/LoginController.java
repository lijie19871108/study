package com.TYYJ.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public @ResponseBody String login(){
		try {
			SecurityUtils.getSubject().login(new UsernamePasswordToken("tom","000000"));
			return "login successed!";
		} catch (Exception e) {
			// TODO: handle exception
			return "login error:"+e.getMessage();
		}
	}
	
}

package com.TYYJ.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello {

	@RequestMapping(value="hello")
	public @ResponseBody String say(){
		return "hello world";
	}
	
}

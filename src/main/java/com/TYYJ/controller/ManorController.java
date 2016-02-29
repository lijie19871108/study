package com.TYYJ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.TYYJ.service.ManorService;
import com.alibaba.fastjson.JSON;
import com.tyyj.db.Entities.TyyjManor;

@Controller
public class ManorController {

	@Autowired
	private ManorService manorService;
	
	@RequestMapping(value="/manors")
	public @ResponseBody String getAllManors(){
		List<TyyjManor> manors = manorService.getAllManors();
		return JSON.toJSONString(manors);
	}
	
	@RequestMapping(value="/manors", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	public @ResponseBody String addManor(){
		return "";
	}
	
	
	@RequestMapping(value="/manors/{manorId}", method=RequestMethod.PUT, produces="text/plain;charset=UTF-8")
	public @ResponseBody String updateManor(@PathVariable String manorId){
		return "";
	}
	
	@RequestMapping(value="/manors/{manorId}", method=RequestMethod.DELETE, produces="text/plain;charset=UTF-8")
	public @ResponseBody String deleteManor(@PathVariable String manorId){
		return "";
	}
}

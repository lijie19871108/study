package com.TYYJ.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tyyj.db.Entities.TyyjManor;
import com.tyyj.db.service.BaseInfoManageService;

@Component
public class ManorService {

	@Autowired
	private BaseInfoManageService manageService;
	
	/**
	 * @return
	 */
	public List<TyyjManor> getAllManors(){
		List<TyyjManor> manors = manageService.getAllManors();
		return manors;
	}
	
	/**
	 * @param manor
	 * @return
	 */
	public boolean createManors(TyyjManor manor){
		return true;
	}
	
	/**
	 * @param manor
	 * @return
	 */
	public boolean updateManors(TyyjManor manor){
		return true;
	}
	
	/**
	 * @param manorId
	 * @return
	 */
	public boolean deleteManors(String manorId){
		return true;
	}
}

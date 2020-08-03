package com.manh.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manh.entity.LPN;
import com.manh.repository.LPNRepository;

@RestController
public class LPNController {
	
	@Autowired
	private LPNRepository lpnRepository;
	
	@GetMapping (value="/findLpnByItemName")
	public List<LPN> findLpnByItem(@RequestParam String itemName){
	
		List<LPN> lpnList = lpnRepository.findByItemName(itemName);		
		return ( null != lpnList || !lpnList.isEmpty() ? lpnList : Arrays.asList(new LPN()) );
	}
	
	
	@GetMapping (value="/getAllLpn")
	public List<LPN> getAllLpn(){
	
		List<LPN> lpnList = lpnRepository.findAll();	
		return lpnList;
	}

}

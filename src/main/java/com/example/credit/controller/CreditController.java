package com.example.credit.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.credit.dto.Account;


@RestController
@RequestMapping("/credit")
public class CreditController {
	
	@PostMapping
	public Map<String, Boolean> receiveNewUserInfo(@RequestBody Account accInfo) {

		System.out.println(" Received to  CreditService : " + accInfo.toString());
		Map<String, Boolean> map = new HashMap<String, Boolean>();

		map.put("status", true);

		return map;

	}


}

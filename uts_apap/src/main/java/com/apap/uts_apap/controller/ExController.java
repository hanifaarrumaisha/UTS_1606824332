package com.apap.uts_apap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apap.uts_apap.service.ExServiceImpl;

@Controller
public class ExController {
	
	@Autowired
	ExServiceImpl exService;	
	
	@RequestMapping(value="/")
	private String home() {
		return "home";
	}
	
	
}

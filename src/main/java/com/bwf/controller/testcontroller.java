package com.bwf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroller {

	@RequestMapping("test")
	public void test(){
		System.out.println("test controller");
		int a;
	}
}

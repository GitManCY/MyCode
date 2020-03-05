package com.itmayiedu.controller;

import com.itmayiedu.extspringmvc.extannotation.ExtController;
import com.itmayiedu.extspringmvc.extannotation.ExtRequestMapping;

@ExtController
@ExtRequestMapping("/ext")
public class ExtIndexController {
	@ExtRequestMapping("/test")
	public String test(String name,Integer age) {
		System.out.println("手写springmvc框架...");
		return "index";
	}
}

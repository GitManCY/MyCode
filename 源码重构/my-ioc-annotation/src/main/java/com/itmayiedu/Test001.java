package com.itmayiedu;

import com.itmayiedu.service.UserService;
import com.itmayiedu.spring.ClassPathXmlApplicationContext;

public class Test001 {


	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("com.itmayiedu.service.impl");
		UserService userService = (UserService) app.getBean("userServiceImpl");
		userService.add();
	}

}

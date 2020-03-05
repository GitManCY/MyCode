package com.itmayiedu.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.itmayiedu.annotation.ExtResource;
import com.itmayiedu.annotation.ExtService;
import com.itmayiedu.service.OrderService;
import com.itmayiedu.service.UserService;

//将该类注入到spring容器里面
@ExtService
public class UserServiceImpl implements UserService {
	// 从Spring容器中读取bean
	@ExtResource
	private OrderService orderServiceImpl;

	public void add() {
		orderServiceImpl.addOrder();
		System.out.println("我是使用反射机制运行的方法");
	}
}

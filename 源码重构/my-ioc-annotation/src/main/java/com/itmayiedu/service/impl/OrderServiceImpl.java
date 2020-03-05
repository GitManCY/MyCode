package com.itmayiedu.service.impl;

import com.itmayiedu.annotation.ExtService;
import com.itmayiedu.service.OrderService;

@ExtService
public class OrderServiceImpl implements OrderService {

	@Override
	public void addOrder() {
		System.out.println("addOrder");
	}

}

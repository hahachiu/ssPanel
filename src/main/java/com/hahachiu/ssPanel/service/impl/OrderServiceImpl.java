package com.hahachiu.ssPanel.service.impl;

import com.hahachiu.ssPanel.entity.Order;
import com.hahachiu.ssPanel.service.*;

public class OrderServiceImpl extends ServiceSupport<Order> implements
		OrderService {

	public void saveOrder(Order order) {
		this.getDao().save(order);

	}

}

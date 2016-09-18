package com.hahachiu.ssPanel.service.impl;

import com.hahachiu.ssPanel.entity.OrderItem;
import com.hahachiu.ssPanel.service.*;

public class OrderItemServiceImpl extends ServiceSupport<OrderItem> implements
	OrderItemService {

	public void updatePassword(long id, String password) {
		// TODO 自动生成的方法存根
		
	}

	public OrderItem getOrderItem(long id) {
		// TODO 自动生成的方法存根
		return this.getDao().get(id);
	}

}


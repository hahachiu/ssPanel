package com.hahachiu.ssPanel.action;

import com.hahachiu.ssPanel.entity.OrderItem;
import com.hahachiu.ssPanel.service.OrderItemService;

public class OrderItemAction extends 
	GenericActionSupport<OrderItem, OrderItemService> {

	private static final long serialVersionUID = 1L;

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public OrderItem getOrderItem() {
		return this.getService().getOrderItem(this.getId());
	}
	
}

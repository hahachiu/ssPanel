package com.hahachiu.ssPanel.service.impl;

import com.hahachiu.ssPanel.entity.OrderItem;
import com.hahachiu.ssPanel.service.*;

public class OrderItemServiceImpl extends ServiceSupport<OrderItem> implements
	OrderItemService {

	public void updatePassword(long id, String password) {
		// TODO �Զ����ɵķ������
		
	}

	public OrderItem getOrderItem(long id) {
		// TODO �Զ����ɵķ������
		return this.getDao().get(id);
	}

}


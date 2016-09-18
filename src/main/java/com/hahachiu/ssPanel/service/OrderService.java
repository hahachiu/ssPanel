package com.hahachiu.ssPanel.service;

import com.hahachiu.ssPanel.entity.Order;

public interface OrderService {

	/**
	 * 保存订单
	 * @param order 要保存的订单对象
	 */
	public void saveOrder(Order order);
}

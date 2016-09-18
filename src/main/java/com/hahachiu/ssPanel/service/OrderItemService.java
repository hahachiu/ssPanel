package com.hahachiu.ssPanel.service;

import com.hahachiu.ssPanel.entity.OrderItem;

public interface OrderItemService {
	/**
	 * 根据订单单项id更新订单中相应单项的密码
	 * @param Id Id
	 * @param String password 新的密码
	 */
	public void updatePassword(long Id, String password);
	
	/**
	 * 返回指定id的订单单项
	 * @param id 订单单项Id
	 * @return 指定的订单单项
	 */
	public OrderItem getOrderItem(long id);
	
}

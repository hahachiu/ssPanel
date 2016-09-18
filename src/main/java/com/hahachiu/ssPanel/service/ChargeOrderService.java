package com.hahachiu.ssPanel.service;

import java.util.List;
import com.hahachiu.ssPanel.entity.ChargeOrder;

public interface ChargeOrderService {

	/**
	 * 返回指定id的充值订单
	 * @param id 充值订单Id
	 * @return 指定的充值订单对象
	 */
	public ChargeOrder getChargeOrder(long id);
	
	/**
	 * 返回所有
	 * @return 所有充值订单的列表
	 */
	public List<ChargeOrder> getAllChargeOrders();
	
	
}
package com.hahachiu.ssPanel.service.impl;

import java.util.List;

import com.hahachiu.ssPanel.entity.ChargeOrder;
import com.hahachiu.ssPanel.service.*;

public class ChargeOrderServiceImpl extends ServiceSupport<ChargeOrder> implements
ChargeOrderService {

	public ChargeOrder getChargeOrder(long id) {
		return this.getDao().get(id);
	}

	public List<ChargeOrder> getAllChargeOrders() {
		return this.getDao().findAll();
	}

}
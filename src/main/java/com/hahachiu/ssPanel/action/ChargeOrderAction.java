package com.hahachiu.ssPanel.action;

import java.util.List;
import com.hahachiu.ssPanel.entity.ChargeOrder;
import com.hahachiu.ssPanel.service.ChargeOrderService;

public class ChargeOrderAction extends
		GenericActionSupport<ChargeOrder, ChargeOrderService> {

	private static final long serialVersionUID = 1L;
	
	public List<ChargeOrder> getChargeOrders(){
		return this.getService().getAllChargeOrders();
	}

}
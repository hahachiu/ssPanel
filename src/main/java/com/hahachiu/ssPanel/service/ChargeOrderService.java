package com.hahachiu.ssPanel.service;

import java.util.List;
import com.hahachiu.ssPanel.entity.ChargeOrder;

public interface ChargeOrderService {

	/**
	 * ����ָ��id�ĳ�ֵ����
	 * @param id ��ֵ����Id
	 * @return ָ���ĳ�ֵ��������
	 */
	public ChargeOrder getChargeOrder(long id);
	
	/**
	 * ��������
	 * @return ���г�ֵ�������б�
	 */
	public List<ChargeOrder> getAllChargeOrders();
	
	
}
package com.hahachiu.ssPanel.service;

import com.hahachiu.ssPanel.entity.OrderItem;

public interface OrderItemService {
	/**
	 * ���ݶ�������id���¶�������Ӧ���������
	 * @param Id Id
	 * @param String password �µ�����
	 */
	public void updatePassword(long Id, String password);
	
	/**
	 * ����ָ��id�Ķ�������
	 * @param id ��������Id
	 * @return ָ���Ķ�������
	 */
	public OrderItem getOrderItem(long id);
	
}

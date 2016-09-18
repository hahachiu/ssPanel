package com.hahachiu.ssPanel.service.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.hahachiu.ssPanel.entity.Plan;
import com.hahachiu.ssPanel.entity.OrderItem;

public class ShoppingCart {

	protected Map<Long,OrderItem> items;
	
	public ShoppingCart() {
		if (items == null) {
			items = new HashMap<Long, OrderItem>();
		}
	}
	
	/**
	 * ����ײ͵����ﳵ
	 * @param Plan Ҫ��ӵ����ﳵ���ײ�
	 * @param Month �������������0��
	 */
	public void addPlan(Plan Plan, int Month) {
		if (Month <= 0) return;
		//������ﳵ���Ѿ����ڸ��ײͣ������Ӹ��ײͶ����������
		if (items.containsKey(Plan.getId())){
			OrderItem item = items.get(Plan.getId());
			item.setMonth(item.getMonth() + Month);
		}
		else {  //��������µĶ�����
			OrderItem newItem = new OrderItem();
			newItem.setPlan(Plan);
			newItem.setMonth(Month);
			items.put(Plan.getId(), newItem);
		}
	}
	
	/**
	 * �����ײ�id���¹��ﳵ����Ӧ�����������
	 * @param PlanId �ײ�Id
	 * @param Month �µ��������������0)
	 */
	public void updateMonth(long PlanId, int Month) {
		if (Month <= 0) return;
		if (items.containsKey(PlanId)){
			OrderItem item = items.get(PlanId);
			item.setMonth(Month);
		}
	}
	
	/**
	 * �ӹ��ﳵ��ɾ��ָ��id���ײ�
	 * @param PlanId Ҫɾ�����ײ�Id
	 */
	public void removePlan(long PlanId) {
		items.remove(PlanId);
	}
	
	/**
	 * ���ع��ﳵ�����ײͶ�������ܼ۸�
	 * @return �ܼ۸�
	 */
	public float getTotalPrice(){
		float totalPrice = 0;
		for (OrderItem item : items.values()){
			Plan Plan = item.getPlan();
			totalPrice += Plan.getPrice() * item.getMonth();
		}
		return totalPrice;
	}
	
	/**
	 * ���ع��ﳵ�������ײ͵Ķ�����
	 * @return �����������
	 */
	public Set<OrderItem> getOrderItems()
	{
		return new HashSet<OrderItem>(items.values());
	}
	
	/**
	 * ��չ��ﳵ
	 */
	public void clear() {
		items.clear();
	}
	
}

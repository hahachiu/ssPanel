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
	 * 添加套餐到购物车
	 * @param Plan 要添加到购物车的套餐
	 * @param Month 数量（必须大于0）
	 */
	public void addPlan(Plan Plan, int Month) {
		if (Month <= 0) return;
		//如果购物车里已经存在该套餐，则增加该套餐订单项的数量
		if (items.containsKey(Plan.getId())){
			OrderItem item = items.get(Plan.getId());
			item.setMonth(item.getMonth() + Month);
		}
		else {  //否则，添加新的订单项
			OrderItem newItem = new OrderItem();
			newItem.setPlan(Plan);
			newItem.setMonth(Month);
			items.put(Plan.getId(), newItem);
		}
	}
	
	/**
	 * 根据套餐id更新购物车中相应订单项的数量
	 * @param PlanId 套餐Id
	 * @param Month 新的数量（必须大于0)
	 */
	public void updateMonth(long PlanId, int Month) {
		if (Month <= 0) return;
		if (items.containsKey(PlanId)){
			OrderItem item = items.get(PlanId);
			item.setMonth(Month);
		}
	}
	
	/**
	 * 从购物车中删除指定id的套餐
	 * @param PlanId 要删除的套餐Id
	 */
	public void removePlan(long PlanId) {
		items.remove(PlanId);
	}
	
	/**
	 * 返回购物车所有套餐订单项的总价格
	 * @return 总价格
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
	 * 返回购物车中所有套餐的订单项
	 * @return 订单项的数组
	 */
	public Set<OrderItem> getOrderItems()
	{
		return new HashSet<OrderItem>(items.values());
	}
	
	/**
	 * 清空购物车
	 */
	public void clear() {
		items.clear();
	}
	
}

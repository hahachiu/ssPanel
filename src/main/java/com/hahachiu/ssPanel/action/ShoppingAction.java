package com.hahachiu.ssPanel.action;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;

import com.hahachiu.ssPanel.entity.Plan;
import com.hahachiu.ssPanel.entity.Order;
import com.hahachiu.ssPanel.entity.OrderItem;
import com.hahachiu.ssPanel.entity.User;
import com.hahachiu.ssPanel.service.PlanService;
import com.hahachiu.ssPanel.service.OrderService;
import com.hahachiu.ssPanel.service.impl.ShoppingCart;

public class ShoppingAction extends GenericActionSupport<Order, OrderService>{
	
	private static final long serialVersionUID = 1L;
	
	private long[] planId;
	private int[] month;
	
	private PlanService planService;
	
	public long[] getPlanId() {
		return planId;
	}

	public void setPlanId(long[] planId) {
		this.planId = planId;
	}

	public int[] getMonth() {
		return month;
	}

	public void setMonth(int[] month) {
		this.month = month;
	}
		
	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}
	
	/**
	 * 	��Ӽƻ������ﳵ
	 * @return ��ӳɹ����߼���ͼ����
	 * @throws Exception ���ܻ��׳��쳣
	 */
	public String addToCart() throws Exception {
		Plan plan = planService.getPlan(this.getPlanId()[0]);
		Map<String, Object> session = ActionContext.getContext().getSession();
		ShoppingCart cart = (ShoppingCart) session.get("cart");
		if (cart == null) {
			cart = new ShoppingCart();
		}
		cart.addPlan(plan, this.getMonth()[0]);
		session.put("cart", cart);
		return SUCCESS;
	}
	
	/**
	 * ���¹��ﳵ
	 * @return ���³ɹ�����߼���ͼ����
	 * @throws Exception ���ܻ��׳��쳣
	 */
	public String updateCart() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		ShoppingCart cart = (ShoppingCart) session.get("cart");
		
		for(int i = 0; i < getPlanId().length; i++)
		{
			cart.updateMonth(getPlanId()[i], getMonth()[i]);
		}
		
		return SUCCESS;
	}
	
	/**
	 * �ӹ��ﳵ��ɾ��ָ��Id�ļƻ�
	 * @return ɾ���ɹ�����߼���ͼ����
	 * @throws Exception ���ܻ��׳����쳣
	 */
	public String removeFromCart() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		ShoppingCart cart = (ShoppingCart) session.get("cart");
		cart.removePlan(getPlanId()[0]);
		
		if (cart.getOrderItems().size() == 0) {
			session.remove("cart");
		}
		
		return SUCCESS;
	}
	
	/**
	 * ����
	 * @return ���˳ɹ���ʧ�ܵ��߼���ͼ����
	 * @throws Exception ���ܻ��׳����쳣
	 */
	public String checkout() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		User user = (User) session.get("user");
		ShoppingCart cart = (ShoppingCart) session.get("cart");
		
		if (user == null) {
			this.addActionMessage("Ҫ���㣬���ȵ�¼!");
			return INPUT;
		}
		if (cart == null) {
			this.addActionError("���ﳵΪ�գ��޷����㣡");
			return ERROR;
		}
		
		doCheckout(user, cart);
		session.remove("cart");
		return SUCCESS;
	}

	private void doCheckout(User user, ShoppingCart cart) {
		Order order = new Order();
		
		order.setUser(user);
		user.addOrder(order);
		
		for(OrderItem item: cart.getOrderItems()){
			item.setOrder(order);
			order.addOrderItem(item);
		}
		order.setTotalPrice(cart.getTotalPrice());
		this.getService().saveOrder(order);
		this.setModel(order);
		cart.clear();
	}
	
}

package com.hahachiu.ssPanel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_item",catalog = "ss-panel")
public class OrderItem extends BaseEntity {
	
	private int month;
	private Order order;
	private Plan plan;
	private int port;
	private String password;
	private int dataUsage;
	private int dataTotal;

	public OrderItem() {
		super(0);
		this.setMonth(0);
		this.setPort(0);
		this.setPassword(null);
		this.setDataUsage(0);
		this.setDataTotal(0);
	}
	
	@Column(name = "month")
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
		//order.addOrderItem(this);
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plan_id")
	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@Column(name = "port")
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "data_usage")
	public int getDataUsage() {
		return dataUsage;
	}

	public void setDataUsage(int dataUsage) {
		this.dataUsage = dataUsage;
	}
	
	@Column(name = "data_total")
	public int getDataTotal() {
		return dataTotal;
	}

	public void setDataTotal(int dataTotal) {
		this.dataTotal = dataTotal;
	}
	

}

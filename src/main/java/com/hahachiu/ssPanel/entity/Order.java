package com.hahachiu.ssPanel.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders",catalog = "ss-panel")
public class Order extends BaseEntity {

	private User user;
	private float totalPrice;
	private Set<OrderItem> orderItems;
	
	public Order() {
		super(0);
		this.setOrderItems(new HashSet<OrderItem>());
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Column(name = "total_price")
	public float getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void addOrderItem(OrderItem item) {
		item.setOrder(this);
		this.getOrderItems().add(item);
	}

	protected void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	
}

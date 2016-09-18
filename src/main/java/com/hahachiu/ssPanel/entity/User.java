package com.hahachiu.ssPanel.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user",catalog = "ss-panel")
public class User extends BaseEntity{
	
	private String email;
	private String username;
	private String password;
	private float money;
	private Set<Order> orders;
	private Set<ChargeOrder> chargeOrders;
	
	public User() {
		super(0);
		this.setOrders(new HashSet<Order>());
		this.setChargeOrders(new HashSet<ChargeOrder>());
	}
	
	public User(String email, String username, String password){
		this();
		this.setEmail(email);
		this.setUsername(username);
		this.setPassword(password);
		this.setMoney(0);
	}
	
	@Column(name = "email", length = 30)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "username", length = 20)
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "password", length = 64)
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Order> getOrders() {
		return this.orders;
	}
	
	public void addOrder(Order order){
		order.setUser(this);
		this.getOrders().add(order);
	}
	
	protected void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	@Column(name = "money")
	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<ChargeOrder> getChargeOrders() {
		return chargeOrders;
	}
	
	public void addChargeOrder(ChargeOrder chargeOrder){
		chargeOrder.setUser(this);
		this.getChargeOrders().add(chargeOrder);
	}

	public void setChargeOrders(Set<ChargeOrder> chargeOrders) {
		this.chargeOrders = chargeOrders;
	}

}

package com.hahachiu.ssPanel.entity;


import javax.persistence.*;


@Entity
@Table(name="chargeorders",catalog = "ss-panel")
public class ChargeOrder extends BaseEntity {
	
	private String way;
	private int other;
	private float figure;
	private User user;
	
	public ChargeOrder() {
		super(0);
		// TODO 自动生成的构造函数存根
	}
	
	public ChargeOrder(String way,int other,float figure) {
		super(0);
		this.setFigure(figure);
		this.setOther(other);
		this.setWay(way);
		// TODO 自动生成的构造函数存根
	}

	@Column(name = "way", length = 10)
	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	@Column(name = "other")
	public int getOther() {
		return other;
	}

	public void setOther(int other) {
		this.other = other;
	}

	@Column(name = "figure")
	public float getFigure() {
		return figure;
	}

	public void setFigure(float figure) {
		this.figure = figure;
	}

	@ManyToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

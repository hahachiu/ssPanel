package com.hahachiu.ssPanel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="plan",catalog = "ss-panel")
public class Plan extends BaseEntity {

	private String name;
	private float price;
	private String dataMonth;
	private String detail;
	
	public Plan(){
		super(0);
	}
	public Plan(String name, float price, String dataMonth){
		this();
		this.setName(name);
		this.setPrice(price);
		this.setdataMonth(dataMonth);
	}
	
	@Column(name = "name", length = 10)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "price")
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Column(name = "dataMonth", length = 10)
	public String getdataMonth() {
		return dataMonth;
	}
	
	public void setdataMonth(String dataMonth) {
		this.dataMonth = dataMonth;
	}
	
	@Column(name = "detail", length = 50)
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}

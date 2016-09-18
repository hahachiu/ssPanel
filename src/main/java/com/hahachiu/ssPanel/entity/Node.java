package com.hahachiu.ssPanel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nodes",catalog = "ss-panel")
public class Node extends BaseEntity {

	private String nodeName;
	private String state;
	private String address;
	private String encryption;
	private int ratio;
	private String detail;
	
	public Node(String nodeName,String state,String address,String encryption,String detail,int ratio) {
		super(0);
		this.setAddress(address);
		this.setDetail(detail);
		this.setEncryption(encryption);
		this.setNodeName(nodeName);
		this.setRatio(ratio);
		this.setState(state);
		// TODO 自动生成的构造函数存根
	}
	
	public Node() {
		super(0);
		
	}
	
	@Column(name = "nodeName", length = 20)
	public String getNodeName() {
		return nodeName;
	}
	
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	
	@Column(name = "state", length = 10)
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name = "address", length = 20)
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "encryption", length = 20)
	public String getEncryption() {
		return encryption;
	}
	
	public void setEncryption(String encryption) {
		this.encryption = encryption;
	}
	
	@Column(name = "ratio")
	public int getRatio() {
		return ratio;
	}
	
	public void setRatio(int ratio) {
		this.ratio = ratio;
	}
	
	@Column(name = "detail", length = 30)
	public String getDetail() {
		return detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}

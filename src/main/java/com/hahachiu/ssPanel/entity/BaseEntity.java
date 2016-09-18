package com.hahachiu.ssPanel.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;


@MappedSuperclass
public abstract class BaseEntity {

	private long id;
	private Date creationDate;
	
	public BaseEntity(long id) {
		this.id = id;
		this.setCreationDate(Calendar.getInstance().getTime());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
    @Column(name = "creation_time")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}

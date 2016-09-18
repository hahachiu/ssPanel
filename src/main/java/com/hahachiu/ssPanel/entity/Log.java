/**
 * 
 */
package com.hahachiu.ssPanel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author HAHAchiu
 *
 */
@Entity
@Table(name="logs",catalog = "ss-panel")
public class Log extends BaseEntity {
	
	private String title;
	private String content;
	
	public Log() {
		super(0);
		// TODO 自动生成的构造函数存根
	}

	@Column(name = "title", length = 20)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "content", length = 50)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}

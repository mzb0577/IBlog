package com.mzb.myblog.domain;

import java.util.Date;

public class AccessRecord {
	private Long id;
	
	private Integer user_id;
	
	private String visitor_ip;
	
	private Integer blog_id;
	
	private Date access_time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getVisitor_ip() {
		return visitor_ip;
	}

	public void setVisitor_ip(String visitor_ip) {
		this.visitor_ip = visitor_ip;
	}

	public Integer getBlog_id() {
		return blog_id;
	}

	public void setBlog_id(Integer blog_id) {
		this.blog_id = blog_id;
	}

	public Date getAccess_time() {
		return access_time;
	}

	public void setAccess_time(Date access_time) {
		this.access_time = access_time;
	}
}

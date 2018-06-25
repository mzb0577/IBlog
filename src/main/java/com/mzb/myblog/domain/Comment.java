package com.mzb.myblog.domain;

import java.util.Date;

public class Comment {
	private Integer id;
	
	private Integer user_id;
	
	private Integer blog_id;
	
	private String content;
	
	private Integer parent_id;
	
	private Boolean is_parent;
	
	private Date create_time;
	
	private Boolean is_del;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getBlog_id() {
		return blog_id;
	}

	public void setBlog_id(Integer blog_id) {
		this.blog_id = blog_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public Boolean getIs_parent() {
		return is_parent;
	}

	public void setIs_parent(Boolean is_parent) {
		this.is_parent = is_parent;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Boolean getIs_del() {
		return is_del;
	}

	public void setIs_del(Boolean is_del) {
		this.is_del = is_del;
	}
}

package com.mzb.myblog.domain;

import java.util.Date;

public class Blog {
	private Integer id;
	
	private String title;
	
	private String brief;
	
	private String content;
	
	private String author;
	
	private Integer category_id;
	
	private Date create_time;
	
	private Date modify_time;
	
	private Integer page_view;
	
	private Integer recommond_count;
	
	private Integer oppose_count;
	
	private Integer state;
	
	private Boolean is_del;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getModify_time() {
		return modify_time;
	}

	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}

	public Integer getPage_view() {
		return page_view;
	}

	public void setPage_view(Integer page_view) {
		this.page_view = page_view;
	}

	public Integer getRecommond_count() {
		return recommond_count;
	}

	public void setRecommond_count(Integer recommond_count) {
		this.recommond_count = recommond_count;
	}

	public Integer getOppose_count() {
		return oppose_count;
	}

	public void setOppose_count(Integer oppose_count) {
		this.oppose_count = oppose_count;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Boolean getIs_del() {
		return is_del;
	}

	public void setIs_del(Boolean is_del) {
		this.is_del = is_del;
	}
}

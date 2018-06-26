/**
 * 
 */
package com.mzb.myblog.domain;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class User {
	
	private Integer id;
	
	private String name;
	
	private String password;
	
	private String qq;
	
	private String wechat;
	
	private String e_mail;
		
	private Integer role;
	
	private Date create_time;
	
	private Date update_time;
	
	//是否禁用
	private Boolean is_disabled;
	
	//是否删除
	private Boolean is_del;
	
	public User(){
		this.create_time = new Date();
		this.is_disabled = false;	
		this.is_del = false;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Boolean getIs_disabled() {
		return is_disabled;
	}

	public void setIs_disabled(Boolean is_disabled) {
		this.is_disabled = is_disabled;
	}

	public Boolean getIs_del() {
		return is_del;
	}

	public void setIs_del(Boolean is_del) {
		this.is_del = is_del;
	}
}

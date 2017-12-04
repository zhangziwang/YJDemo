package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class UserLog {

	private Integer userLogId;//
	private Integer userId;//用户id
	private Integer action;//动作
	private Date create_date;//创建时间
	private Date update_date;//修改时间
	private String login_ip;//
	@Id
	@SequenceGenerator(name="user_log",sequenceName="sql_user_log",allocationSize=1)
	@GeneratedValue(generator="user_log",strategy=GenerationType.SEQUENCE)
	public Integer getUserLogId() {
		return userLogId;
	}
	public void setUserLogId(Integer userLogId) {
		this.userLogId = userLogId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getAction() {
		return action;
	}
	public void setAction(Integer action) {
		this.action = action;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public String getLogin_ip() {
		return login_ip;
	}
	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}
	

}

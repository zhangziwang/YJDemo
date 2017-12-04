package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class PushNotice {
	private Integer pn_ID;//
	private String title;//
	private String pn_content;//
	private Integer status;//公告状态
	private Date create_date;//创建时间
	private Date update_date;//修改时间
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Id
	@SequenceGenerator(name="push_notice",sequenceName="sql_push_notice",allocationSize=1)
	@GeneratedValue(generator="push_notice",strategy=GenerationType.SEQUENCE)
	public Integer getPn_ID() {
		return pn_ID;
	}
	public void setPn_ID(Integer pn_ID) {
		this.pn_ID = pn_ID;
	}
	public String getPn_content() {
		return pn_content;
	}
	public void setPn_content(String pn_content) {
		this.pn_content = pn_content;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	
}

package com.demo.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class SmsInterface
{
	private Integer si_id;//ID
	private String si_name;//短信模板名称
	private Integer si_type;//担心模板类型
	private String address;//短信模板地址
	private String si_param;//短信模板参数
	private String si_content;//短信模板内容
	private Date createdate;//添加时间
	@Id
	@SequenceGenerator(name="sms_interface",sequenceName="sql_sms_interface",allocationSize=1)
	@GeneratedValue(generator="sms_interface",strategy=GenerationType.SEQUENCE)
	public Integer getSi_id() {
		return si_id;
	}
	public void setSi_id(Integer si_id) {
		this.si_id = si_id;
	}
	public String getSi_name() {
		return si_name;
	}
	public void setSi_name(String si_name) {
		this.si_name = si_name;
	}
	public Integer getSi_type() {
		return si_type;
	}
	public void setSi_type(Integer si_type) {
		this.si_type = si_type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSi_param() {
		return si_param;
	}
	public void setSi_param(String si_param) {
		this.si_param = si_param;
	}
	public String getSi_content() {
		return si_content;
	}
	public void setSi_content(String si_content) {
		this.si_content = si_content;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
}
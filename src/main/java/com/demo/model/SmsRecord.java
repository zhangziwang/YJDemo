package com.demo.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class SmsRecord
{
	private Integer sms_record_id;//ID
	private Integer sms_recordtype;//短信类型
	private String phone;//手机号码
	private String sms_record_code;//验证码
	private String sms_record_content;//短信内容
	private String sms_record_result;//返回结果
	private Integer status;//状态
	private Date senddate;//发送时间
	private Date createdate;//创建时间
	@Id
	@SequenceGenerator(name="sms_record",sequenceName="sql_sms_record",allocationSize=1)
	@GeneratedValue(generator="sms_record",strategy=GenerationType.SEQUENCE)
	public Integer getSms_record_id() {
		return sms_record_id;
	}
	public void setSms_record_id(Integer sms_record_id) {
		this.sms_record_id = sms_record_id;
	}
	public Integer getSms_recordtype() {
		return sms_recordtype;
	}
	public void setSms_recordtype(Integer sms_recordtype) {
		this.sms_recordtype = sms_recordtype;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSms_record_code() {
		return sms_record_code;
	}
	public void setSms_record_code(String sms_record_code) {
		this.sms_record_code = sms_record_code;
	}
	public String getSms_record_content() {
		return sms_record_content;
	}
	public void setSms_record_content(String sms_record_content) {
		this.sms_record_content = sms_record_content;
	}
	public String getSms_record_result() {
		return sms_record_result;
	}
	public void setSms_record_result(String sms_record_result) {
		this.sms_record_result = sms_record_result;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getSenddate() {
		return senddate;
	}
	public void setSenddate(Date senddate) {
		this.senddate = senddate;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
}
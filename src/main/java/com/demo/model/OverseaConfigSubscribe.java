package com.demo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *监视配置订购列表
 */
@Entity
public class OverseaConfigSubscribe
{
	private Integer ocs_id;//id
	private Integer member_id;//会员id
	private Integer oversea_id;//海外配置id
	private String ocs_name;//姓名
	private String phone;//电话
	private String addr;//地址
	private Integer status;//0
	private Date create_date;//创建时间
	private Date update_date;//修改时间
	
	@Id
	@SequenceGenerator(name="oversea_config_subscribe",sequenceName="sql_oversea_config_subscribe",allocationSize=1)
	@GeneratedValue(generator="oversea_config_subscribe",strategy=GenerationType.SEQUENCE)
	public Integer getOcs_id() {
		return ocs_id;
	}
	public void setOcs_id(Integer ocs_id) {
		this.ocs_id = ocs_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getOversea_id() {
		return oversea_id;
	}
	public void setOversea_id(Integer oversea_id) {
		this.oversea_id = oversea_id;
	}
	
	public String getOcs_name() {
		return ocs_name;
	}
	public void setOcs_name(String ocs_name) {
		this.ocs_name = ocs_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
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
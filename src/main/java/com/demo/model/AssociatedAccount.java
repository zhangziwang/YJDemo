package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 * 第三方登录信息表
 *
 */
@Entity(name="associated_account")
public class AssociatedAccount
{
	private Integer associated_account_id;
	private Integer member_id;//会员id
	private String associated_account_type;//账号类型（微信，QQ）
	private String associated_account_name;//账号名称
	private String identifying;//账号标识
	private Integer status;
	private Date create_date;//添加时间
	private Date update_date;//修改时间
	@Id
	@SequenceGenerator(name="associated_account",sequenceName="seq_associated_account",allocationSize=1)
	@GeneratedValue(generator="associated_account",strategy=GenerationType.SEQUENCE)
	public Integer getAssociated_account_id() {
		return associated_account_id;
	}
	public void setAssociated_account_id(Integer associated_account_id) {
		this.associated_account_id = associated_account_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getAssociated_account_type() {
		return associated_account_type;
	}
	public void setAssociated_account_type(String associated_account_type) {
		this.associated_account_type = associated_account_type;
	}
	public String getAssociated_account_name() {
		return associated_account_name;
	}
	public void setAssociated_account_name(String associated_account_name) {
		this.associated_account_name = associated_account_name;
	}
	public String getIdentifying() {
		return identifying;
	}
	public void setIdentifying(String identifying) {
		this.identifying = identifying;
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
package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *�ɷ���Ŀ
 */
@Entity(name="member_puc_charge_item")
public class MemberPucChargeItem
{
	private Integer id;//id
	private Integer member_id ;//�û�id
	private Integer home_id ;//homeid
	private String charge_type  ;//�ɷ����
	private Integer charge_institution_id ;//�ɷѻ���id
	private String charge_institution_name;//�ɷѻ�������
	private String charge_institution_code;//�ɷѻ�������
	private String customer_code;//�ͻ�����
	private String commentt;//��ע
	@Id
	@Column(name="mpci_id")
	@SequenceGenerator(name="member_puc_charge_item",sequenceName="sql_member_puc_charge_item",allocationSize=1)
	@GeneratedValue(generator="member_puc_charge_item",strategy=GenerationType.SEQUENCE)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getHome_id() {
		return home_id;
	}
	public void setHome_id(Integer home_id) {
		this.home_id = home_id;
	}
	public String getCharge_type() {
		return charge_type;
	}
	public void setCharge_type(String charge_type) {
		this.charge_type = charge_type;
	}
	public Integer getCharge_institution_id() {
		return charge_institution_id;
	}
	public void setCharge_institution_id(Integer charge_institution_id) {
		this.charge_institution_id = charge_institution_id;
	}
	public String getCharge_institution_name() {
		return charge_institution_name;
	}
	public void setCharge_institution_name(String charge_institution_name) {
		this.charge_institution_name = charge_institution_name;
	}
	public String getCharge_institution_code() {
		return charge_institution_code;
	}
	public void setCharge_institution_code(String charge_institution_code) {
		this.charge_institution_code = charge_institution_code;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getCommentt() {
		return commentt;
	}
	public void setCommentt(String commentt) {
		this.commentt = commentt;
	}
	
}
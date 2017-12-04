package com.demo.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *�ɷѼ�ͥ��
 */
@Entity(name="member_puc_charge_home")
public class MemberPucChargeHome
{
	private Integer mpch_id;//id
	private Integer member_id ;//�û�id
	private String name;//��ͥ����
	private Integer is_default ;//�Ƿ�Ĭ��(0:n1:y)
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	
	@Id
	@SequenceGenerator(name="member_puc_charge_home",sequenceName="seq_member_puc_charge_home",allocationSize=1)
	@GeneratedValue(generator="member_puc_charge_home",strategy=GenerationType.SEQUENCE)
	public Integer getMpch_id() {
		return mpch_id;
	}
	public void setMpch_id(Integer mpch_id) {
		this.mpch_id = mpch_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIs_default() {
		return is_default;
	}
	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
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
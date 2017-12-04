package com.demo.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.format.annotation.DateTimeFormat;
/**
 *ȷ�����������Ʒ
 */
@Entity(name="financial_planner")
public class FinancialPlanner
{
	private Integer financial_planner_id;//id
	private Integer member_id;//��Աid
		
	private String name;//��ʵ����
	private String orgname;//��������
	private String mycard;//�ҵ���Ƭ
	private String address;//�ʼĵ�ַ
	private Integer status;//
		
	private Date create_date;//���ʱ��
	private Date update_date;//�޸�ʱ��
	@Id
	@SequenceGenerator(name="financial_planner",sequenceName="seq_financial_planner",allocationSize=1)
	@GeneratedValue(generator="financial_planner",strategy=GenerationType.SEQUENCE)
	public Integer getFinancial_planner_id() {
		return financial_planner_id;
	}
	public void setFinancial_planner_id(Integer financial_planner_id) {
		this.financial_planner_id = financial_planner_id;
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
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getMycard() {
		return mycard;
	}
	public void setMycard(String mycard) {
		this.mycard = mycard;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
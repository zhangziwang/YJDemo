package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="fp_subscribe_record")
public class FpSubscribeRecord {
	private Integer   fpsr_id ;
	private Integer	   member_id  ;//'��Աid',
	private Integer	   subscribe_id ;//'˽ļԤԼ��¼id',
	private String	   tech_user_id ;// 'eǩ�������˺�',
	private String	   tech_user_seal ;//'eǩ������ӡ��',
	private String	   org_path  ;//'ԭǩ���ĵ�·��',
	private String   new_path  ;//'��ǩ���ĵ�·��',
	private Integer	   status ;//
	private Date	   create_date ;
	private Date   update_date ;
	private String   filed ;//'�����ֶ�',
	@Id
	@SequenceGenerator(name="fp_subscribe_record",sequenceName="seq_fpsr",allocationSize=1)
	@GeneratedValue(generator="fp_subscribe_record",strategy=GenerationType.SEQUENCE)
	public Integer getFpsr_id() {
		return fpsr_id;
	}
	public void setFpsr_id(Integer fpsr_id) {
		this.fpsr_id = fpsr_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getSubscribe_id() {
		return subscribe_id;
	}
	public void setSubscribe_id(Integer subscribe_id) {
		this.subscribe_id = subscribe_id;
	}
	public String getTech_user_id() {
		return tech_user_id;
	}
	public void setTech_user_id(String tech_user_id) {
		this.tech_user_id = tech_user_id;
	}
	public String getTech_user_seal() {
		return tech_user_seal;
	}
	public void setTech_user_seal(String tech_user_seal) {
		this.tech_user_seal = tech_user_seal;
	}
	public String getOrg_path() {
		return org_path;
	}
	public void setOrg_path(String org_path) {
		this.org_path = org_path;
	}
	public String getNew_path() {
		return new_path;
	}
	public void setNew_path(String new_path) {
		this.new_path = new_path;
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
	public String getFiled() {
		return filed;
	}
	public void setFiled(String filed) {
		this.filed = filed;
	}
	
}

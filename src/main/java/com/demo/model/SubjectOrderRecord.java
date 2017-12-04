package com.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class SubjectOrderRecord
{
	private Integer sor_id;//ID
	private String serial_number;//��ˮ��
	private Integer deal_type;//��������
	private Integer amount;//�������
	private Integer status;//����״̬
	private Integer subject_id;//���id
	private Integer member_id;//�û�id
	private Integer delflag;//�Ƿ�ɾ��
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	@Id
	@SequenceGenerator(name="subject_order_record",sequenceName="sql_subject_order_record",allocationSize=1)
	@GeneratedValue(generator="subject_order_record",strategy=GenerationType.SEQUENCE)
	public Integer getSor_id() {
		return sor_id;
	}
	public void setSor_id(Integer sor_id) {
		this.sor_id = sor_id;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public Integer getDeal_type() {
		return deal_type;
	}
	public void setDeal_type(Integer deal_type) {
		this.deal_type = deal_type;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
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
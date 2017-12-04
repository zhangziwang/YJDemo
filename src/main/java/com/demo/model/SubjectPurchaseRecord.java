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
public class SubjectPurchaseRecord
{

	private Integer spr_id;//ID
	private String serial_number;//��ˮ��
	private Integer amount;//������
	private String deal_ip;//����ip
	private Integer subject_id;//���Id
	private Integer member_id;//
	private Integer delflag ;//
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	private Integer interest;//������Ϣ
	private Integer ispayment;//�Ƿ񻹿�
	private Integer pay_interest_times;//0
	private Integer last_profit_day;//����Ϣ��
	private String bonus_info;//��������Ϣ��app��ʵ��Ͷ�ʶ��+�����ȣ�
	@Id
	@SequenceGenerator(name="subject_purchase_record",sequenceName="sql_subject_purchase_record",allocationSize=1)
	@GeneratedValue(generator="subject_purchase_record",strategy=GenerationType.SEQUENCE)
	public Integer getSpr_id() {
		return spr_id;
	}
	public void setSpr_id(Integer spr_id) {
		this.spr_id = spr_id;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getDeal_ip() {
		return deal_ip;
	}
	public void setDeal_ip(String deal_ip) {
		this.deal_ip = deal_ip;
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
	public Integer getInterest() {
		return interest;
	}
	public void setInterest(Integer interest) {
		this.interest = interest;
	}
	public Integer getIspayment() {
		return ispayment;
	}
	public void setIspayment(Integer ispayment) {
		this.ispayment = ispayment;
	}
	public Integer getPay_interest_times() {
		return pay_interest_times;
	}
	public void setPay_interest_times(Integer pay_interest_times) {
		this.pay_interest_times = pay_interest_times;
	}
	public Integer getLast_profit_day() {
		return last_profit_day;
	}
	public void setLast_profit_day(Integer last_profit_day) {
		this.last_profit_day = last_profit_day;
	}
	public String getBonus_info() {
		return bonus_info;
	}
	public void setBonus_info(String bonus_info) {
		this.bonus_info = bonus_info;
	}
}
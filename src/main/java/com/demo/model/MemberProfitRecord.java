package com.demo.model;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *�û����濨��¼��
 */
@Entity(name="member_profit_record")
public class MemberProfitRecord
{
	private Integer mpr_id;//id
	private String serial_number  ;//��ˮ��
	
	private Integer type ;//
	private Integer amount ;//���
	private Integer member_id ;//�û�id
	private Integer delflag ;//
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	private String commentt  ;//��ע
	private Integer purchase_id ;//���id
	private Integer profit_year ;//��Ϣ��
	private Integer profit_month ;//��Ϣ��
	private Integer profit_day ;//��Ϣ��
	@Id
	@SequenceGenerator(name="member_profit_record",sequenceName="sql_member_profit_record",allocationSize=1)
	@GeneratedValue(generator="member_profit_record",strategy=GenerationType.SEQUENCE)
	public Integer getMpr_id() {
		return mpr_id;
	}
	public void setMpr_id(Integer mpr_id) {
		this.mpr_id = mpr_id;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
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
	public String getCommentt() {
		return commentt;
	}
	public void setCommentt(String commentt) {
		this.commentt = commentt;
	}
	public Integer getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(Integer purchase_id) {
		this.purchase_id = purchase_id;
	}
	public Integer getProfit_year() {
		return profit_year;
	}
	public void setProfit_year(Integer profit_year) {
		this.profit_year = profit_year;
	}
	public Integer getProfit_month() {
		return profit_month;
	}
	public void setProfit_month(Integer profit_month) {
		this.profit_month = profit_month;
	}
	public Integer getProfit_day() {
		return profit_day;
	}
	public void setProfit_day(Integer profit_day) {
		this.profit_day = profit_day;
	}
	
}
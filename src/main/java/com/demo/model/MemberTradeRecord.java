package com.demo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *���׼�¼��
 */
@Entity
public class MemberTradeRecord
{

	private Integer id;//id
	private Integer member_id;//�û�id
	private String trade_no ;//���׺�
	private String trade_name ;//��������
	private String counterpart ;//���׶Է�
	private Integer amount ;//���׽��
	private String trade_type ;//���׷���
	private Integer fund_flow ;//�ʽ�����(0:����1:����)
	private Integer trade_status  ;//����״̬
	private String ext_field_1 ;//��չ1
	private String ext_field_2 ;//��չ2
	private String ext_field_3 ;//��չ3
	
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	@Id
	@Column(name="mtr_id")
	@SequenceGenerator(name="member_trade_record",sequenceName="sql_member_trade_record",allocationSize=1)
	@GeneratedValue(generator="member_trade_record",strategy=GenerationType.SEQUENCE)
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
	public String getTrade_no() {
		return trade_no;
	}
	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}
	public String getTrade_name() {
		return trade_name;
	}
	public void setTrade_name(String trade_name) {
		this.trade_name = trade_name;
	}
	public String getCounterpart() {
		return counterpart;
	}
	public void setCounterpart(String counterpart) {
		this.counterpart = counterpart;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getTrade_type() {
		return trade_type;
	}
	public void setTrade_type(String trade_type) {
		this.trade_type = trade_type;
	}
	public Integer getFund_flow() {
		return fund_flow;
	}
	public void setFund_flow(Integer fund_flow) {
		this.fund_flow = fund_flow;
	}
	public Integer getTrade_status() {
		return trade_status;
	}
	public void setTrade_status(Integer trade_status) {
		this.trade_status = trade_status;
	}
	public String getExt_field_1() {
		return ext_field_1;
	}
	public void setExt_field_1(String ext_field_1) {
		this.ext_field_1 = ext_field_1;
	}
	public String getExt_field_2() {
		return ext_field_2;
	}
	public void setExt_field_2(String ext_field_2) {
		this.ext_field_2 = ext_field_2;
	}
	public String getExt_field_3() {
		return ext_field_3;
	}
	public void setExt_field_3(String ext_field_3) {
		this.ext_field_3 = ext_field_3;
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
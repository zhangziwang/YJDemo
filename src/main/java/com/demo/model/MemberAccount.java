package com.demo.model;



import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *�û���Ŀ��
 */
@Entity(name="member_account")
public class MemberAccount{
	private Integer member_account_id;//id
	private Integer member_id;//�û�id
	private Integer useable_balance;//�������
	private Integer imuseale_balance;//�������
	private Integer total_profit;//�ۼ�����
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	private Integer bonus_amount;//������
	private Integer invest_amount;//Ͷ���ܶ�
	private Integer delflag;//0
	private Integer bbin_amount;//�����
	@Id
	@SequenceGenerator(name="member_account",sequenceName="seq_member_account",allocationSize=1)
	@GeneratedValue(generator="member_account",strategy=GenerationType.SEQUENCE)
	public Integer getMember_account_id() {
		return member_account_id;
	}
	public void setMember_account_id(Integer member_account_id) {
		this.member_account_id = member_account_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getUseable_balance() {
		return useable_balance;
	}
	public void setUseable_balance(Integer useable_balance) {
		this.useable_balance = useable_balance;
	}
	public Integer getImuseale_balance() {
		return imuseale_balance;
	}
	public void setImuseale_balance(Integer imuseale_balance) {
		this.imuseale_balance = imuseale_balance;
	}
	public Integer getTotal_profit() {
		return total_profit;
	}
	public void setTotal_profit(Integer total_profit) {
		this.total_profit = total_profit;
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
	public Integer getBonus_amount() {
		return bonus_amount;
	}
	public void setBonus_amount(Integer bonus_amount) {
		this.bonus_amount = bonus_amount;
	}
	public Integer getInvest_amount() {
		return invest_amount;
	}
	public void setInvest_amount(Integer invest_amount) {
		this.invest_amount = invest_amount;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	public Integer getBbin_amount() {
		return bbin_amount;
	}
	public void setBbin_amount(Integer bbin_amount) {
		this.bbin_amount = bbin_amount;
	}
}
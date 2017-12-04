package com.demo.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 奖励记录表
 *
 */
@Entity(name="award_records")
public class AwardRecords
{
	private Integer award_records_id;
	private Member invitingid;//邀请人id
	private Member byinvitingid;//被邀请人id
	private Integer award_records_type;//奖励类型（0：注册奖励，1：投资奖励）
	private Double binary_float;//奖励金额
	private Integer isaward;//0:未奖励  1：已奖励
	private Date addtime;//添加时间
	@Id
	@SequenceGenerator(name="award_records",sequenceName="seq_award_records",allocationSize=1)
	@GeneratedValue(generator="award_records",strategy=GenerationType.SEQUENCE)
	public Integer getAward_records_id() {
		return award_records_id;
	}
	public void setAward_records_id(Integer award_records_id) {
		this.award_records_id = award_records_id;
	}
	public Member getInvitingid() {
		return invitingid;
	}
	public void setInvitingid(Member invitingid) {
		this.invitingid = invitingid;
	}
	public Member getByinvitingid() {
		return byinvitingid;
	}
	public void setByinvitingid(Member byinvitingid) {
		this.byinvitingid = byinvitingid;
	}
	public Integer getAward_records_type() {
		return award_records_type;
	}
	public void setAward_records_type(Integer award_records_type) {
		this.award_records_type = award_records_type;
	}
	public Double getBinary_float() {
		return binary_float;
	}
	public void setBinary_float(Double binary_float) {
		this.binary_float = binary_float;
	}
	public Integer getIsaward() {
		return isaward;
	}
	public void setIsaward(Integer isaward) {
		this.isaward = isaward;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

}
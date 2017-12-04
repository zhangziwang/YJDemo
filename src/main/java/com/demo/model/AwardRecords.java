package com.demo.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * ������¼��
 *
 */
@Entity(name="award_records")
public class AwardRecords
{
	private Integer award_records_id;
	private Member invitingid;//������id
	private Member byinvitingid;//��������id
	private Integer award_records_type;//�������ͣ�0��ע�ά����1��Ͷ�ʽ�����
	private Double binary_float;//�������
	private Integer isaward;//0:δ����  1���ѽ���
	private Date addtime;//���ʱ��
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
package com.demo.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.format.annotation.DateTimeFormat;
/**
 *�û����п���
 */
@Entity(name="member_bankcards")
public class MemberBankcards
{
	private Integer member_bankcards_id;//id
	private String member_bankcards_type ;//���п�����
	private Integer member_id ;//�û�id
	private String card_no ;//����
	private Integer delflag ;//�Ƿ�ɾ����0������ʹ�ã�2����ɾ����
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	private String cardaddress;//�����������ڵ�
	
	@Id
	@SequenceGenerator(name="member_bankcards",sequenceName="seq_member_bankcards",allocationSize=1)
	@GeneratedValue(generator="member_bankcards",strategy=GenerationType.SEQUENCE)
	public Integer getMember_bankcards_id() {
		return member_bankcards_id;
	}
	public void setMember_bankcards_id(Integer member_bankcards_id) {
		this.member_bankcards_id = member_bankcards_id;
	}
	public String getMember_bankcards_type() {
		return member_bankcards_type;
	}
	public void setMember_bankcards_type(String member_bankcards_type) {
		this.member_bankcards_type = member_bankcards_type;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getCard_no() {
		return card_no;
	}
	public void setCard_no(String card_no) {
		this.card_no = card_no;
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
	public String getCardaddress() {
		return cardaddress;
	}
	public void setCardaddress(String cardaddress) {
		this.cardaddress = cardaddress;
	}
	

}
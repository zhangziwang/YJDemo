package com.demo.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *�������
 */
@Entity(name="feedback")
public class Feedback
{
	private Integer feedback_id;
	private Integer member_id;//��Աid
	private String feedback_content;//�����������
	private Date create_date;//���ʱ��
	@Id
	@SequenceGenerator(name="feedback",sequenceName="seq_feedback",allocationSize=1)
	@GeneratedValue(generator="feedback",strategy=GenerationType.SEQUENCE)
	public Integer getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(Integer feedback_id) {
		this.feedback_id = feedback_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getFeedback_content() {
		return feedback_content;
	}
	public void setFeedback_content(String feedback_content) {
		this.feedback_content = feedback_content;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

}
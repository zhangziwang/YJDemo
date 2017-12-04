package com.demo.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *意见反馈
 */
@Entity(name="feedback")
public class Feedback
{
	private Integer feedback_id;
	private Integer member_id;//会员id
	private String feedback_content;//意见反馈内容
	private Date create_date;//添加时间
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
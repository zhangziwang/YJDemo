package com.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class SubjectFieldRecord 
{
	private Integer sfr_id;//ID
	private Integer subject_id;//���Id
	private Integer field_id;//�ֶ�id
	private String field_value;//�ֶ�ֵ
	private Integer delflag;//ɾ�����
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	@Id
	@SequenceGenerator(name="subject_field_record",sequenceName="sql_subject_field_record",allocationSize=1)
	@GeneratedValue(generator="subject_field_record",strategy=GenerationType.SEQUENCE)
	public Integer getSfr_id() {
		return sfr_id;
	}
	public void setSfr_id(Integer sfr_id) {
		this.sfr_id = sfr_id;
	}
	public Integer getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}
	public Integer getField_id() {
		return field_id;
	}
	public void setField_id(Integer field_id) {
		this.field_id = field_id;
	}
	public String getField_value() {
		return field_value;
	}
	public void setField_value(String field_value) {
		this.field_value = field_value;
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
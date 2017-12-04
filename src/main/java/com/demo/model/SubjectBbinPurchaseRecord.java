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
public class SubjectBbinPurchaseRecord
{
	private Integer sbpr_id;//ID
	private Integer subject_id;//标的Id
	private Integer field_id;//字段id
	private String field_value;//字段值
	private Integer delflag;//删除标记
	private Date create_date;//创建时间
	private Date update_date;//修改时间
	@Id
	@SequenceGenerator(name="subject_bbin_purchase_record",sequenceName="seq_subject_bbin_purchase_record",allocationSize=1)
	@GeneratedValue(generator="subject_bbin_purchase_record",strategy=GenerationType.SEQUENCE)
	public Integer getSbpr_id() {
		return sbpr_id;
	}
	public void setSbpr_id(Integer sbpr_id) {
		this.sbpr_id = sbpr_id;
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
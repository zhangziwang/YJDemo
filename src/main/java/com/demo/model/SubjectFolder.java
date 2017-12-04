package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class SubjectFolder
{
	private Integer subject_folder_id;//id
	private Date create_date;//创建时间
	private Date update_date;//修改时间
	@Id
	@SequenceGenerator(name="subject_folder",sequenceName="sql_subject_folder",allocationSize=1)
	@GeneratedValue(generator="subject_folder",strategy=GenerationType.SEQUENCE)
	public Integer getSubject_folder_id() {
		return subject_folder_id;
	}
	public void setSubject_folder_id(Integer subject_folder_id) {
		this.subject_folder_id = subject_folder_id;
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
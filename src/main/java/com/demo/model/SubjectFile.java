package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class SubjectFile
{
	private Integer subject_file_id;//主键
	private Integer folder_id;//附件主表id
	private String subject_file_path;//文件路径
	private String file_name;//文件名
	private String original_name;//原文件名
	private Date create_date;//创建时间
	private Date update_date;//修改时间
	@Id
	@SequenceGenerator(name="subject_file",sequenceName="sql_subject_file",allocationSize=1)
	@GeneratedValue(generator="subject_file",strategy=GenerationType.SEQUENCE)
	public Integer getSubject_file_id() {
		return subject_file_id;
	}
	public void setSubject_file_id(Integer subject_file_id) {
		this.subject_file_id = subject_file_id;
	}
	public Integer getFolder_id() {
		return folder_id;
	}
	public void setFolder_id(Integer folder_id) {
		this.folder_id = folder_id;
	}
	public String getSubject_file_path() {
		return subject_file_path;
	}
	public void setSubject_file_path(String subject_file_path) {
		this.subject_file_path = subject_file_path;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getOriginal_name() {
		return original_name;
	}
	public void setOriginal_name(String original_name) {
		this.original_name = original_name;
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
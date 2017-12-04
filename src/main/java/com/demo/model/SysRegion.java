package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/*
 * ��ֵ������
 */
@Entity
public class SysRegion {
	private Integer sys_region_ID;//
	private String gb2260;//��������������
	private String name;//����������
	private Integer region_level;//����������
	private Integer parent_id;//��id
	private String parent_ids;//��id�б�
	private String parent_gb2260;//������
	private String dialling_code;//�绰����
	private Date create_date;//
	private Date last_modified;//
	@Id
	@SequenceGenerator(name="sys_region",sequenceName="sql_sys_region",allocationSize=1)
	@GeneratedValue(generator="sys_region",strategy=GenerationType.SEQUENCE)
	public Integer getSys_region_ID() {
		return sys_region_ID;
	}
	public void setSys_region_ID(Integer sys_region_ID) {
		this.sys_region_ID = sys_region_ID;
	}
	public String getGb2260() {
		return gb2260;
	}
	public void setGb2260(String gb2260) {
		this.gb2260 = gb2260;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRegion_level() {
		return region_level;
	}
	public void setRegion_level(Integer region_level) {
		this.region_level = region_level;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public String getParent_ids() {
		return parent_ids;
	}
	public void setParent_ids(String parent_ids) {
		this.parent_ids = parent_ids;
	}
	public String getParent_gb2260() {
		return parent_gb2260;
	}
	public void setParent_gb2260(String parent_gb2260) {
		this.parent_gb2260 = parent_gb2260;
	}
	public String getDialling_code() {
		return dialling_code;
	}
	public void setDialling_code(String dialling_code) {
		this.dialling_code = dialling_code;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getLast_modified() {
		return last_modified;
	}
	public void setLast_modified(Date last_modified) {
		this.last_modified = last_modified;
	}
	
}

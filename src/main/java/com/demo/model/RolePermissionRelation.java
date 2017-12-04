package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class RolePermissionRelation {
	private Integer role_id;//��ɫid
	private String permission_ename;//Ȩ������
	private Date create_date;//����ʱ��
	@Id
	@SequenceGenerator(name="role_permission_relation",sequenceName="sql_role_permission_relation",allocationSize=1)
	@GeneratedValue(generator="role_permission_relation",strategy=GenerationType.SEQUENCE)
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getPermission_ename() {
		return permission_ename;
	}
	public void setPermission_ename(String permission_ename) {
		this.permission_ename = permission_ename;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
}

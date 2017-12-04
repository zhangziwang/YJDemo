package com.demo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Subject 
{
	private Integer subject_id;//ID
	private String serial_number;//��ˮ��
	private String serial_no;//��ͬ��
	private String name;//�������
	private Integer type;//�������
	private Integer status;//���״̬
	private Integer floor_amount;//��Ͷ���
	private Integer amount;//��Ľ��
	private Integer first_id;//ʼ��id
	private Integer parent_id;//����id
	private Integer period;//�������
	private String purpose;//���Ŀ��
	private Date raise_start;//ļ����ʼ
	private Date raise_end;//ļ������
	private Integer refund_way;//���ʽ
	private Integer safeGuard_way;//���Ϸ�ʽ
	private Date start_date;//��Ŀ�ʼ����
	private Date end_date;//��Ľ�������
	private Float year_rate;//�껯��
	private String commentt;//��Ʒ����
	private Integer folder_id;//�ļ���Id
	private Integer delflag;//�Ƿ�ɾ��
	private Date update_date;//��������
	private Date create_date;//��������
	private String borrowername;//���������
	private Integer borrowerid;//�����id
	private Integer bought;//�ѹ�����
	private String projectDetails;//��Ŀ����
	private String safetyControl;//��ȫ����
	private Integer exper_status;//������Ƿ���Թ���0����1���ǣ�
	@Id
	@SequenceGenerator(name="subject",sequenceName="sql_subject",allocationSize=1)
	@GeneratedValue(generator="subject",strategy=GenerationType.SEQUENCE)
	public Integer getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public String getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getFloor_amount() {
		return floor_amount;
	}
	public void setFloor_amount(Integer floor_amount) {
		this.floor_amount = floor_amount;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getFirst_id() {
		return first_id;
	}
	public void setFirst_id(Integer first_id) {
		this.first_id = first_id;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Date getRaise_start() {
		return raise_start;
	}
	public void setRaise_start(Date raise_start) {
		this.raise_start = raise_start;
	}
	public Date getRaise_end() {
		return raise_end;
	}
	public void setRaise_end(Date raise_end) {
		this.raise_end = raise_end;
	}
	public Integer getRefund_way() {
		return refund_way;
	}
	public void setRefund_way(Integer refund_way) {
		this.refund_way = refund_way;
	}
	public Integer getSafeGuard_way() {
		return safeGuard_way;
	}
	public void setSafeGuard_way(Integer safeGuard_way) {
		this.safeGuard_way = safeGuard_way;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Float getYear_rate() {
		return year_rate;
	}
	public void setYear_rate(Float year_rate) {
		this.year_rate = year_rate;
	}
	public String getCommentt() {
		return commentt;
	}
	public void setCommentt(String commentt) {
		this.commentt = commentt;
	}
	public Integer getFolder_id() {
		return folder_id;
	}
	public void setFolder_id(Integer folder_id) {
		this.folder_id = folder_id;
	}
	public Integer getDelflag() {
		return delflag;
	}
	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getBorrowername() {
		return borrowername;
	}
	public void setBorrowername(String borrowername) {
		this.borrowername = borrowername;
	}
	public Integer getBorrowerid() {
		return borrowerid;
	}
	public void setBorrowerid(Integer borrowerid) {
		this.borrowerid = borrowerid;
	}
	public Integer getBought() {
		return bought;
	}
	public void setBought(Integer bought) {
		this.bought = bought;
	}
	public String getProjectDetails() {
		return projectDetails;
	}
	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}
	public String getSafetyControl() {
		return safetyControl;
	}
	public void setSafetyControl(String safetyControl) {
		this.safetyControl = safetyControl;
	}
	public Integer getExper_status() {
		return exper_status;
	}
	public void setExper_status(Integer exper_status) {
		this.exper_status = exper_status;
	}
	
	
}
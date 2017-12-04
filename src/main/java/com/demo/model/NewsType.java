package com.demo.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *��������б�
 */
@Entity
public class NewsType
{

	private Integer news_type_id;//id
	private String news_type_name;//����
	private String news_type_link;//����
	private String note;//��ע
	private Integer news_type_sort;//����
	private String pageType;//ҳ������
	private Integer supType;//�ϼ����
	private String info;//���
	private String cPhoto;//����ͼƬ
	private String text;//����
	private String seoTitle;//ҳ��seo����
	private String seoKey;//seo�ؼ���
	private String seoDes;//seo����
	private Integer addId;//�����ID
	private Integer updId;//�޸���ID
	
	private Date updTime;//�޸�ʱ��
	private Date addTime;//���ʱ��
	@Id
	@SequenceGenerator(name="news_type",sequenceName="sql_news_type",allocationSize=1)
	@GeneratedValue(generator="news_type",strategy=GenerationType.SEQUENCE)
	public Integer getNews_type_id() {
		return news_type_id;
	}
	public void setNews_type_id(Integer news_type_id) {
		this.news_type_id = news_type_id;
	}
	public String getNews_type_name() {
		return news_type_name;
	}
	public void setNews_type_name(String news_type_name) {
		this.news_type_name = news_type_name;
	}
	public String getNews_type_link() {
		return news_type_link;
	}
	public void setNews_type_link(String news_type_link) {
		this.news_type_link = news_type_link;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Integer getNews_type_sort() {
		return news_type_sort;
	}
	public void setNews_type_sort(Integer news_type_sort) {
		this.news_type_sort = news_type_sort;
	}
	public String getPageType() {
		return pageType;
	}
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	public Integer getSupType() {
		return supType;
	}
	public void setSupType(Integer supType) {
		this.supType = supType;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getcPhoto() {
		return cPhoto;
	}
	public void setcPhoto(String cPhoto) {
		this.cPhoto = cPhoto;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSeoTitle() {
		return seoTitle;
	}
	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}
	public String getSeoKey() {
		return seoKey;
	}
	public void setSeoKey(String seoKey) {
		this.seoKey = seoKey;
	}
	public String getSeoDes() {
		return seoDes;
	}
	public void setSeoDes(String seoDes) {
		this.seoDes = seoDes;
	}
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public Integer getUpdId() {
		return updId;
	}
	public void setUpdId(Integer updId) {
		this.updId = updId;
	}
	public Date getUpdTime() {
		return updTime;
	}
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
}
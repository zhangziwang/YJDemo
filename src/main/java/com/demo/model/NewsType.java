package com.demo.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *新闻类别列表
 */
@Entity
public class NewsType
{

	private Integer news_type_id;//id
	private String news_type_name;//名称
	private String news_type_link;//链接
	private String note;//备注
	private Integer news_type_sort;//排序
	private String pageType;//页面类型
	private Integer supType;//上级类别
	private String info;//简介
	private String cPhoto;//封面图片
	private String text;//内容
	private String seoTitle;//页面seo标题
	private String seoKey;//seo关键字
	private String seoDes;//seo描述
	private Integer addId;//添加人ID
	private Integer updId;//修改人ID
	
	private Date updTime;//修改时间
	private Date addTime;//添加时间
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
package com.demo.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *新闻列表
 */
@Entity
public class News
{
	private Integer news_id;//id
	private Integer news_typeId;//所属类别
	private String title;//标题
	private String subTitle;//副标题
	private Integer sort;//排序
	private String info;//简介
	private String cPhoto;//封面图片
	private String link;//链接地址ַ
	private String author;//作者
	private String source;//来源
	private String label;//标签
	private Integer clickNumber;//点击数量
	private String text;//内容
	private String filelink;//附件地址ַ
	private String seoTitle;//页面seo标题
	private String seoKey;//seo关键字
	private String seoDes;//seo描述
	private Integer placTop;//是否置顶 0：为是  1为否�
	private Integer recommend;//是否推荐
	private Integer audits;//是否审核
	private Integer addId;//添加人ID
	private Integer updId;//修改人ID
	private Date updTime;//修改时间
	private Date addTime;//添加时间
	@Id
	@SequenceGenerator(name="news",sequenceName="sql_news",allocationSize=1)
	@GeneratedValue(generator="news",strategy=GenerationType.SEQUENCE)
	public Integer getNews_id() {
		return news_id;
	}
	public void setNews_id(Integer news_id) {
		this.news_id = news_id;
	}
	public Integer getNews_typeId() {
		return news_typeId;
	}
	public void setNews_typeId(Integer news_typeId) {
		this.news_typeId = news_typeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
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
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Integer getClickNumber() {
		return clickNumber;
	}
	public void setClickNumber(Integer clickNumber) {
		this.clickNumber = clickNumber;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getFilelink() {
		return filelink;
	}
	public void setFilelink(String filelink) {
		this.filelink = filelink;
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
	public Integer getPlacTop() {
		return placTop;
	}
	public void setPlacTop(Integer placTop) {
		this.placTop = placTop;
	}
	public Integer getRecommend() {
		return recommend;
	}
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	public Integer getAudits() {
		return audits;
	}
	public void setAudits(Integer audits) {
		this.audits = audits;
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
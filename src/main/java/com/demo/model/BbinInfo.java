package com.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
/**
 *体验金信息
 */
@Entity(name="bbin_info")
public class BbinInfo
{
	private Integer bbin_info_id;
	private Integer memberId;//会员id
	private BigDecimal amont;//金额
	private Integer status;//状态（0：是）
	private Date create_date;
	private Date update_date;
	@Id
	@SequenceGenerator(name="bbin_info",sequenceName="seq_bbin_info",allocationSize=1)
	@GeneratedValue(generator="bbin_info",strategy=GenerationType.SEQUENCE)
	public Integer getBbin_info_id() {
		return bbin_info_id;
	}
	public void setBbin_info_id(Integer bbin_info_id) {
		this.bbin_info_id = bbin_info_id;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public BigDecimal getAmont() {
		return amont;
	}
	public void setAmont(BigDecimal amont) {
		this.amont = amont;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
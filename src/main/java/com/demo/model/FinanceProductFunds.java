package com.demo.model;





import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


/**
 *���������Ʒ
 */
@Entity(name="finance_product_funds")
public class FinanceProductFunds
{
	private Integer finance_product_funds_id;//id
	private String finance_product_funds_type;//��Ʒ����
	private String finance_product_funds_name;//����
		
	private Integer status;//״̬(0:δ������1:ļ���У�2:�ѽ���)
	private Integer period;//����
	private Integer floor_amount;//��Ͷ���
	private Integer year_rate;//�껯��
	private Integer subscribe_count;//ԤԼ����
		
	private String product_topic;//����ר��/���ڻ���
	private String product_factor;//��ƷҪ��
	private String product_strategy;//��Ʒ����
	private String product_manager;//��������ϸ
		
	private Date create_date;//
	private Date update_date;//
		
	private String product_manager_name;//����������
	private String product_manager_pic;//������ͼƬ
	private String product_manager_title;//������ͷ��
	private String  product_manager_desc;//��Ʒ�����˽���
	private String invest_points;//Ͷ�ʷ���
		
		
	private Integer amount;//ļ�����
	private Integer sold_amount;//���۽��
	private Integer buyer_count;//��������
		
	private Date start_date;//��ʼʱ��
	private Date end_date;//����ʱ��
		
	private String ratio;//��Ӷ����
	private String contract;//˽ļ��ͬ
	private String bank_account;//�����˻���֧������|�����˺�|������
	@Id
	@SequenceGenerator(name="finance_product_funds",sequenceName="seq_finance_product_funds",allocationSize=1)
	@GeneratedValue(generator="finance_product_funds",strategy=GenerationType.SEQUENCE)
	public Integer getFinance_product_funds_id() {
		return finance_product_funds_id;
	}
	public void setFinance_product_funds_id(Integer finance_product_funds_id) {
		this.finance_product_funds_id = finance_product_funds_id;
	}
	public String getFinance_product_funds_type() {
		return finance_product_funds_type;
	}
	public void setFinance_product_funds_type(String finance_product_funds_type) {
		this.finance_product_funds_type = finance_product_funds_type;
	}
	public String getFinance_product_funds_name() {
		return finance_product_funds_name;
	}
	public void setFinance_product_funds_name(String finance_product_funds_name) {
		this.finance_product_funds_name = finance_product_funds_name;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public Integer getFloor_amount() {
		return floor_amount;
	}
	public void setFloor_amount(Integer floor_amount) {
		this.floor_amount = floor_amount;
	}
	public Integer getYear_rate() {
		return year_rate;
	}
	public void setYear_rate(Integer year_rate) {
		this.year_rate = year_rate;
	}
	public Integer getSubscribe_count() {
		return subscribe_count;
	}
	public void setSubscribe_count(Integer subscribe_count) {
		this.subscribe_count = subscribe_count;
	}
	public String getProduct_topic() {
		return product_topic;
	}
	public void setProduct_topic(String product_topic) {
		this.product_topic = product_topic;
	}
	public String getProduct_factor() {
		return product_factor;
	}
	public void setProduct_factor(String product_factor) {
		this.product_factor = product_factor;
	}
	public String getProduct_strategy() {
		return product_strategy;
	}
	public void setProduct_strategy(String product_strategy) {
		this.product_strategy = product_strategy;
	}
	public String getProduct_manager() {
		return product_manager;
	}
	public void setProduct_manager(String product_manager) {
		this.product_manager = product_manager;
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
	public String getProduct_manager_name() {
		return product_manager_name;
	}
	public void setProduct_manager_name(String product_manager_name) {
		this.product_manager_name = product_manager_name;
	}
	public String getProduct_manager_pic() {
		return product_manager_pic;
	}
	public void setProduct_manager_pic(String product_manager_pic) {
		this.product_manager_pic = product_manager_pic;
	}
	public String getProduct_manager_title() {
		return product_manager_title;
	}
	public void setProduct_manager_title(String product_manager_title) {
		this.product_manager_title = product_manager_title;
	}
	public String getProduct_manager_desc() {
		return product_manager_desc;
	}
	public void setProduct_manager_desc(String product_manager_desc) {
		this.product_manager_desc = product_manager_desc;
	}
	public String getInvest_points() {
		return invest_points;
	}
	public void setInvest_points(String invest_points) {
		this.invest_points = invest_points;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getSold_amount() {
		return sold_amount;
	}
	public void setSold_amount(Integer sold_amount) {
		this.sold_amount = sold_amount;
	}
	public Integer getBuyer_count() {
		return buyer_count;
	}
	public void setBuyer_count(Integer buyer_count) {
		this.buyer_count = buyer_count;
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
	public String getRatio() {
		return ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}
	public String getContract() {
		return contract;
	}
	public void setContract(String contract) {
		this.contract = contract;
	}
	public String getBank_account() {
		return bank_account;
	}
	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}
	
}
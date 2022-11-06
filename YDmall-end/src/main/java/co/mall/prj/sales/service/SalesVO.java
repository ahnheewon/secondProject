package co.mall.prj.sales.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class SalesVO {
	private String salesId; //구매번호?
	private String memberId; //멤버 테이블의 회원id 외래키
	private int salesQuantity; //구매 수량

	private String productName; //판매된 상품 이름
	private String productSize; //판매된 상품 사이즈

	private int salesTotalPrice; //주문 총액
	private String salesDate; //구매 일자
	private String salesDeliveryStatus; //배송 상태
	private String salesDeliveryId; //송장 번호
	private String salesNeeds; //상품 주문 시 요청사함
	public String getSalesId() {
		return salesId;
	}
	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getSalesQuantity() {
		return salesQuantity;
	}
	public void setSalesQuantity(int salesQuantity) {
		this.salesQuantity = salesQuantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public int getSalesTotalPrice() {
		return salesTotalPrice;
	}
	public void setSalesTotalPrice(int salesTotalPrice) {
		this.salesTotalPrice = salesTotalPrice;
	}
	public String getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(String salesDate) {
		this.salesDate = salesDate;
	}
	public String getSalesDeliveryStatus() {
		return salesDeliveryStatus;
	}
	public void setSalesDeliveryStatus(String salesDeliveryStatus) {
		this.salesDeliveryStatus = salesDeliveryStatus;
	}
	public String getSalesDeliveryId() {
		return salesDeliveryId;
	}
	public void setSalesDeliveryId(String salesDeliveryId) {
		this.salesDeliveryId = salesDeliveryId;
	}
	public String getSalesNeeds() {
		return salesNeeds;
	}
	public void setSalesNeeds(String salesNeeds) {
		this.salesNeeds = salesNeeds;
	}
	
	
}

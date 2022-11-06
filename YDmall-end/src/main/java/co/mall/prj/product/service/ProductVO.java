package co.mall.prj.product.service;

public class ProductVO {
	private int productId; // 상품 고유 번호
	private String productMajor; // 상품 대분류
	private String productMinor; // 상품 소분류
	private String productName; // 상품 이름
	private String productSize; // 상품 사이즈
	private int productPrice; // 상품 가격
	private int productQuantity; // 상품 재고 수량
	private String productEvent; // 상품 세일 유무
	private String productDefault; // 상품 노출 기본값
	private String productAttach; // 상품 사진 이름
	private String productAttachDir; // 상품 사진 저장 위치
	private String productExplain; // 상품 상세 설명
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductMajor() {
		return productMajor;
	}
	public void setProductMajor(String productMajor) {
		this.productMajor = productMajor;
	}
	public String getProductMinor() {
		return productMinor;
	}
	public void setProductMinor(String productMinor) {
		this.productMinor = productMinor;
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
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductEvent() {
		return productEvent;
	}
	public void setProductEvent(String productEvent) {
		this.productEvent = productEvent;
	}
	public String getProductDefault() {
		return productDefault;
	}
	public void setProductDefault(String productDefault) {
		this.productDefault = productDefault;
	}
	public String getProductAttach() {
		return productAttach;
	}
	public void setProductAttach(String productAttach) {
		this.productAttach = productAttach;
	}
	public String getProductAttachDir() {
		return productAttachDir;
	}
	public void setProductAttachDir(String productAttachDir) {
		this.productAttachDir = productAttachDir;
	}
	public String getProductExplain() {
		return productExplain;
	}
	public void setProductExplain(String productExplain) {
		this.productExplain = productExplain;
	}
	
	
}

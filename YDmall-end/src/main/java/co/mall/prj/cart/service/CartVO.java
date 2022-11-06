
package co.mall.prj.cart.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//장바구니, 관심상품용 테이블

public class CartVO {
	private String memberId; // 회원 아이디 
	private int productId; // 상품 고유 번호
	private String productName; // 상품명
	private int productPrice; // 상품 가격
	private String ProductSize; // 상품 파일명
	private int cartQuantity; // 구매 수량
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductSize() {
		return ProductSize;
	}
	public void setProductSize(String productSize) {
		ProductSize = productSize;
	}
	public int getCartQuantity() {
		return cartQuantity;
	}
	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}
	
	
	
}

package co.mall.prj.member.service;

public class MemberVO {
//	member_id VARCHAR2(50) primary key , 
//	member_password VARCHAR2(150) not null,
//	member_name VARCHAR2(50),
//	member_name2 VARCHAR2(50),
//	member_tel VARCHAR2(150) not null,
//	member_tel2 VARCHAR2(150) not null,
//	member_address VARCHAR2(300),
//	member_address2 VARCHAR2(300),
//	member_gender VARCHAR2(50),
//	member_birth date,
//	member_email VARCHAR2(200),
//	member_join date default sysdate not null,
//	member_total_price number default 0,
//	member_point number default 0, 
//	member_author VARCHAR2(50)
	private String memberId; //	member_id VARCHAR2(50) primary key , /pk 회원아이디
	private String memberPassword; //	member_password VARCHAR2(150) not null,/비밀번호
	private String memberName; //	member_name VARCHAR2(50),/이름
	private String memberName2; //	member_name2 VARCHAR2(50)/이름2
	private String memberTel; //	member_tel VARCHAR2(150) not null,/이메일
	private String memberTel2; //	member_tel2 VARCHAR2(150) not null,/전화번호
	private String memberAddress; //	member_address VARCHAR2(300),/전화번호2
	private String memberAddress2; //	member_address2 VARCHAR2(300),/회원 주소
	private String memberGender; //	member_gender VARCHAR2(50),/회원 주소 2
	private String memberBirth; //	member_birth date,/성별
	private String memberEmail; //	member_email VARCHAR2(200),/생일
	private String memberJoin; //	member_join date default sysdate not null,/가입일
	private int memberTotalPrice; //	member_total_price number default 0,/총 구매 금액(누적)
	private int memberPoint; //	member_point number default 0, /로그인, 물건 구매 시 쌓이는 회원 포인트(누적, 사용가능)
	private String memberAuthor; //	member_author VARCHAR2(50) /회원or 운영진 구분
	
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberPassword=" + memberPassword + ", memberName=" + memberName
				+ ", memberName2=" + memberName2 + ", memberTel=" + memberTel + ", memberTel2=" + memberTel2
				+ ", memberAddress=" + memberAddress + ", memberAddress2=" + memberAddress2 + ", memberGender="
				+ memberGender + ", memberBirth=" + memberBirth + ", memberEmail=" + memberEmail + ", memberJoin="
				+ memberJoin + ", memberTotalPrice=" + memberTotalPrice + ", memberPoint=" + memberPoint
				+ ", memberAuthor=" + memberAuthor + "]";
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberName2() {
		return memberName2;
	}

	public void setMemberName2(String memberName2) {
		this.memberName2 = memberName2;
	}

	public String getMemberTel() {
		return memberTel;
	}

	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}

	public String getMemberTel2() {
		return memberTel2;
	}

	public void setMemberTel2(String memberTel2) {
		this.memberTel2 = memberTel2;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberAddress2() {
		return memberAddress2;
	}

	public void setMemberAddress2(String memberAddress2) {
		this.memberAddress2 = memberAddress2;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberJoin() {
		return memberJoin;
	}

	public void setMemberJoin(String memberJoin) {
		this.memberJoin = memberJoin;
	}

	public int getMemberTotalPrice() {
		return memberTotalPrice;
	}

	public void setMemberTotalPrice(int memberTotalPrice) {
		this.memberTotalPrice = memberTotalPrice;
	}

	public int getMemberPoint() {
		return memberPoint;
	}

	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}

	public String getMemberAuthor() {
		return memberAuthor;
	}

	public void setMemberAuthor(String memberAuthor) {
		this.memberAuthor = memberAuthor;
	}

	
}

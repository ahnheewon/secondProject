package co.mall.prj.board.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class BoardVO {
	
	private int boardId; // 게시글 번호
	private String memberId; // 게시글 작성자
	private String boardDate; // 작성일자
	private String boardTitle; // 제목
	private String boardContent; // 게시글 내용
	private int boardHit; // 조회수
	private String boardAttach; // 파일 업로드
	private String boardAttachDir; // 물리적 파일 저장 위치
	private String boardRole; // 게시판 구분용 role ex)R=리뷰, Q=QnA, N=공지사항 등
	private int boardReplyTo; // 덧글 구분용 ex) 1=게시글 1의 덧글
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public int getBoardHit() {
		return boardHit;
	}
	public void setBoardHit(int boardHit) {
		this.boardHit = boardHit;
	}
	public String getBoardAttach() {
		return boardAttach;
	}
	public void setBoardAttach(String boardAttach) {
		this.boardAttach = boardAttach;
	}
	public String getBoardAttachDir() {
		return boardAttachDir;
	}
	public void setBoardAttachDir(String boardAttachDir) {
		this.boardAttachDir = boardAttachDir;
	}
	public String getBoardRole() {
		return boardRole;
	}
	public void setBoardRole(String boardRole) {
		this.boardRole = boardRole;
	}
	public int getBoardReplyTo() {
		return boardReplyTo;
	}
	public void setBoardReplyTo(int boardReplyTo) {
		this.boardReplyTo = boardReplyTo;
	}
	
	
}


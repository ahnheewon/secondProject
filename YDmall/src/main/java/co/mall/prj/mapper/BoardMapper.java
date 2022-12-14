package co.mall.prj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.mall.prj.board.service.BoardVO;

public interface BoardMapper {
	

	List<BoardVO> noticeSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo); // 공지글 등록
	
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	
	void boardHitUpdate(int id); // 조회수 업데이트
	
	
	
}

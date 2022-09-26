package co.mall.prj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.mall.prj.board.service.BoardVO;

public interface BoardMapper {
	
	List<BoardVO> noticeSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	
	void boardHitUpdate(int id); // 조회수 업데이트
	
	List<BoardVO> boardSearchList(@Param("key") String key, @Param("val") String val); // 게시글 검색
	
}

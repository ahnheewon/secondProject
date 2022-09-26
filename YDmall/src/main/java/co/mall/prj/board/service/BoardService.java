package co.mall.prj.board.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> boardSelectList();
	
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	
	void boardHitUpdate(int id);

	List<BoardVO> boardSearchList(String key, String val);	// 게시글 검색
	
}

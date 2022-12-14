package co.mall.prj.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.mall.prj.common.DataSource;
import co.mall.prj.mapper.BoardMapper;

public class BoardServiceImpl implements BoardService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private BoardMapper map = sqlSession.getMapper(BoardMapper.class);
	
	@Override
	public List<BoardVO> boardSelectList() {
		
		return map.noticeSelectList();
	}

	@Override
	public BoardVO boardSelect(BoardVO vo) {
	//	BoardHitUpdate(vo.getBoardId());
		return map.boardSelect(vo);
	}

	@Override
	public int boardInsert(BoardVO vo) {
		
		return map.boardInsert(vo);
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		
		return map.boardUpdate(vo);
	}

	@Override
	public int boardDelete(BoardVO vo) {
		
		return map.boardDelete(vo);
	}

	@Override
	public void boardHitUpdate(int id) {
		map.boardHitUpdate(id);

	}


}

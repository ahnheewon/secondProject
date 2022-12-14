package co.mall.prj.board.review.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mall.prj.board.service.BoardService;
import co.mall.prj.board.service.BoardServiceImpl;
import co.mall.prj.board.service.BoardVO;
import co.mall.prj.common.Command;

public class ReviewSelect implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 상세보기
		
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo.setBoardId(Integer.valueOf(request.getParameter("id"))); // String을 int로 변환.
		vo= dao.boardSelect(vo);
		
		if(vo != null) {
			dao.boardHitUpdate(vo.getBoardId()); // 조회수 증가
			request.setAttribute("vo", vo);
			
		}
		
		return "board/boardSelect";
	}

}

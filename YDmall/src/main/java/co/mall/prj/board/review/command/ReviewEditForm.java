package co.mall.prj.board.review.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mall.prj.board.service.BoardServiceImpl;
import co.mall.prj.board.service.BoardVO;
import co.mall.prj.common.Command;

public class ReviewEditForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 수정폼.
		BoardServiceImpl dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo.setBoardId(Integer.valueOf(request.getParameter("id")));
		vo = dao.boardSelect(vo);
		request.setAttribute("vo", vo);
		
		return "board/reviewEditForm";
	}

}

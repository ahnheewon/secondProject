package co.mall.prj.board.notice.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mall.prj.board.service.BoardService;
import co.mall.prj.board.service.BoardServiceImpl;
import co.mall.prj.board.service.BoardVO;
import co.mall.prj.common.Command;

public class BoardEditForm implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 수정폼.
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		
		
		vo.setBoardId(Integer.valueOf(request.getParameter("id")));
		vo.setBoardRole(request.getParameter("role"));
		vo.setBoardAttach(request.getParameter("file"));
		vo = dao.boardSelect(vo);
		request.setAttribute("vo", vo);
		
		return "board/boardEditForm";
	}

}

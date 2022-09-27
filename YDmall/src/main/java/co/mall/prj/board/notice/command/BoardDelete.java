package co.mall.prj.board.notice.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mall.prj.board.service.BoardService;
import co.mall.prj.board.service.BoardServiceImpl;
import co.mall.prj.board.service.BoardVO;
import co.mall.prj.common.Command;

public class BoardDelete implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 삭제
		
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
				
				vo.setBoardId(Integer.valueOf(request.getParameter("id")));
				vo.setBoardRole(request.getParameter("role"));
				int n = dao.boardDelete(vo);
				
				String viewPage = "board/boardError";
			
				if(n !=0) {			
					viewPage = "noticeSelectList.yd";
				} else {
					request.setAttribute("message", "삭제 실패!");
				}
				return viewPage;
	}

}

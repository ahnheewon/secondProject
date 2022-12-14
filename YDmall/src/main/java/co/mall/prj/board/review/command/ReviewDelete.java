package co.mall.prj.board.review.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mall.prj.board.service.BoardServiceImpl;
import co.mall.prj.board.service.BoardVO;
import co.mall.prj.common.Command;

public class ReviewDelete implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 삭제
		
		BoardServiceImpl dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
				
				vo.setBoardId(Integer.valueOf(request.getParameter("id")));
			int n = dao.boardDelete(vo);
				
				String viewPage = "board/boardError";
			
				if(n !=0) {			
					viewPage = "reviewSelectList.do";
				} else {
					request.setAttribute("message", "정상적으로 삭제되었습니다.");
				}
				return viewPage;
	}

}

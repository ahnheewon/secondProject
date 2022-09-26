package co.mall.prj.board.notice.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mall.prj.board.service.BoardServicelmpl;
import co.mall.prj.board.service.BoardVO;
import co.mall.prj.common.Command;

public class NoticeDelete implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 게시글 삭제
		
		BoardServicelmpl dao = new BoardServicelmpl();
		BoardVO vo = new BoardVO();
				
				vo.setBoardId(Integer.valueOf(request.getParameter("id")));
			int n = dao.boardDelete(vo);
				
				String viewPage = "board/boardError";
			
				if(n !=0) {			
					viewPage = "noticeSelectList.yd";
				} else {
					request.setAttribute("message", "정상적으로 삭제되었습니다.");
				}
				return viewPage;
	}

}

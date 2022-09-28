package co.mall.prj.board.qna.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mall.prj.board.service.BoardService;
import co.mall.prj.board.service.BoardServiceImpl;
import co.mall.prj.board.service.BoardVO;
import co.mall.prj.common.Command;

public class QnaSelectList implements Command {

   @Override
   public String exec(HttpServletRequest request, HttpServletResponse response) {
      // 게시글 전체 목록 보기
	   
      BoardService dao = new BoardServiceImpl();
      List<BoardVO> list = new ArrayList<BoardVO>();
   
      list = dao.qnaSelectList();
      request.setAttribute("list", list);
     
      return "board/qnaSelectList";
   }

}
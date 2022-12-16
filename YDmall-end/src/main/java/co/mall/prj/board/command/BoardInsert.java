package co.mall.prj.board.command;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.mall.prj.board.service.BoardService;
import co.mall.prj.board.service.BoardServiceImpl;
import co.mall.prj.board.service.BoardVO;
import co.mall.prj.common.Command;

public class BoardInsert implements Command {
	
	private String saveFolder = "C:\\Users\\Administrator\\git\\secondProject2\\YDmall-end\\src\\main\\webapp\\img\\product-img"; //실제 파일이 저장되는 공간.	
	private String charactSet = "utf-8"; // 한글깨짐 방지
	private int maxSize = 1024*1024*1024; // 업로드할 파일 최대 사이즈.
	
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
				
		// 공지사항 등록
		
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		String viewPage ="board/boardError";
		String filename="";
		String originalFileName="";
		
		try {
			MultipartRequest multi = 
				new MultipartRequest(request, saveFolder, maxSize, charactSet, new DefaultFileRenamePolicy());
			//파일 저장
			
			filename = multi.getFilesystemName("file"); // 물리적위치에 파일 저장
			originalFileName= multi.getOriginalFileName("file"); // 실제 파일명
			
			vo.setMemberId(multi.getParameter("memberId"));
			vo.setBoardDate(multi.getParameter("boardDate"));
			System.out.println(multi.getParameter("boardTitle"));
			vo.setBoardTitle(multi.getParameter("boardTitle"));
			vo.setBoardContent(multi.getParameter("boardContent"));
			vo.setBoardAttach(originalFileName);
			vo.setBoardAttachDir(saveFolder+File.separator+filename);
			vo.setBoardRole(multi.getParameter("boardRole"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		int n = dao.boardInsert(vo);
		if(n!=0) {
			if(vo.getBoardRole().equals("N")) {
			viewPage = "noticeSelectList.yd";}
			else if(vo.getBoardRole().equals("R")) {
				viewPage = "reviewSelectList.yd";
			} else if(vo.getBoardRole().equals("Q")) {
				viewPage = "qnaSelectList.yd";
			}
		} else {
			request.setAttribute("message", "게시글 등록이 실패했습니다.");
		}
		return viewPage;
	}

}

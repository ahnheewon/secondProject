package co.mall.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mall.prj.board.notice.command.BoardInsert;
import co.mall.prj.board.notice.command.BoardDelete;
import co.mall.prj.board.notice.command.BoardEdit;
import co.mall.prj.board.notice.command.BoardEditForm;
import co.mall.prj.board.notice.command.NoticeSelect;
import co.mall.prj.board.notice.command.NoticeSelectList;
import co.mall.prj.board.notice.command.NoticeWriteForm;
import co.mall.prj.cart.command.Cart;
import co.mall.prj.command.Best;
import co.mall.prj.command.Checkout;
import co.mall.prj.command.Main;
import co.mall.prj.command.Shop;
import co.mall.prj.common.Command;
import co.mall.prj.member.command.Login;
import co.mall.prj.member.command.Member;
import co.mall.prj.member.command.SignUP;
import co.mall.prj.page.command.Bottom;
import co.mall.prj.page.command.Outer;
import co.mall.prj.page.command.Top;
import co.mall.prj.product.Command.ProductDetail;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.yd")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static HashMap<String, Command> map = new HashMap<String, Command>();

	public FrontController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		map.put("/main.yd", new Main());

		map.put("/noticeSelectList.yd", new NoticeSelectList()); // 공지사항
		map.put("/noticeSelect.yd", new NoticeSelect()); // 
		map.put("/noticeWriteForm.yd", new NoticeWriteForm());
		
//		map.put("/reviewSelectList.yd", new ReviewSelectList()); // 리뷰
//		map.put("/reviewSelect.yd", new ReviewSelect()); // 
//		map.put("/reviewWriteForm.yd", new ReviewWriteForm());
//		
//		map.put("/qnaSelectList.yd", new QnaSelectList()); // QnA
//		map.put("/qnaSelect.yd", new QnaSelect()); // 
//		map.put("/qnaWriteForm.yd", new QnaWriteForm());
		
		map.put("/boardInsert.yd", new BoardInsert());	// 게시판CRUD
		map.put("/boardEditForm.yd", new BoardEditForm());  
		map.put("/boardEdit.yd", new BoardEdit());
		map.put("/boardDelete.yd", new BoardDelete()); 
		
		map.put("/shop.yd", new Shop());
		map.put("/cart.yd", new Cart());
		map.put("/checkout.yd", new Checkout());
		map.put("/productDetail.yd", new ProductDetail());
		map.put("/member.yd", new Member());
		
		map.put("/top.yd", new Top());
		map.put("/bottom.yd", new Bottom());
		map.put("/outer.yd", new Outer());
		
		map.put("/best.yd", new Best());
		map.put("/signUp.yd", new SignUP());
		map.put("/login.yd", new Login());
		
		
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());

		System.out.println("page : " + page);
	
		Command command = map.get(page);

		String viewPage = command.exec(request, response);

		System.out.println("커맨드아래 : " + viewPage);

		if (!viewPage.endsWith(".yd")) {

			viewPage = viewPage + ".tiles";
			
			System.out.println("tiles 체크 : " + viewPage);

			RequestDispatcher dis = request.getRequestDispatcher(viewPage);
			dis.forward(request, response);

		} else {
			response.sendRedirect(viewPage);
		}

	}

}

package hello.servlet.web.frontcontroller.x1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 화면 보여주는 컨트롤러
import hello.servlet.domain.member.MemberRepository;


public class MemberFormControllerV1 implements ControllerV1 {

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String viewPath = "/WEB-INF/views/new-form.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
		
	}

}

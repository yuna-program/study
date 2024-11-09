package hello.servlet.web.servletmvc;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet{
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String viewPath = "/WEB-INF/views/new-forms.jsp";
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewPath);
		
		
		//다른 서블릿이나 JSP로 이동할 수 있는 메서드 ( = 서버 내부에서 다시 호출하는 것 ) 
		requestDispatcher.forward(request, response);
		
	}
	
}

//web, xml은 최종 프로젝트 war로 베포할 때 필요한 설정파일이라서 
// 조금전 경로를 못찾은 원인 아니였음 

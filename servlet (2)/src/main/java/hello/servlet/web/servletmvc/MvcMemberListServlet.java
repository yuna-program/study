package hello.servlet.web.servletmvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;

@WebServlet(name = "mvcMemberListServlet", urlPatterns = "/servlet-mvc/members")
public class MvcMemberListServlet extends HttpServlet{

	private MemberRepository memberRepository = MemberRepository.getInstance();

	
	
	 @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("MvcMemberListServlet.service");
		 
		 List<Member> members = memberRepository.findAll();
		 // model 에 members 리스트 담기
		 request.setAttribute("members", members);
		 
		 // 화면 준비
		 String viewPath = "/WEB-INF/views/members.jsp";
		 RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		 dispatcher.forward(request, response);
		 
	}
	
}







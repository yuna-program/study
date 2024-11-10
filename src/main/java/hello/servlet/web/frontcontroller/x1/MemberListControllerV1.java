package hello.servlet.web.frontcontroller.x1;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;

public class MemberListControllerV1 implements ControllerV1 {
	
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 멤버 객체 전체 리스트 조회 비즈니스 로직 호출
		List<Member> members = memberRepository.findAll();
		//멤버 객체 model에 저장 
		request.setAttribute("members", members);
		
		// 요청 위임할 때 화면 경로 
		String viewPath = "/WEB-INF/views/members.jsp";
		
		// 실제 요청 RequestDispatcher 에 위임 
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}

}

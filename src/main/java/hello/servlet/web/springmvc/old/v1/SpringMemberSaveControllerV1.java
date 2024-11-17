package hello.servlet.web.springmvc.old.v1;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;

@Controller
public class SpringMemberSaveControllerV1 {

	@RequestMapping("/springmvc/v1/members/save")
	public ModelAndView process (HttpServletRequest request, HttpServletResponse response) {
		
		MemberRepository memberRepository = MemberRepository.getInstance();
		
		// username , age 파라미터 값 받아서 
		String username = request.getParameter(null);
		int age = Integer.parseInt(request.getParameter("age"));
		
		// 맴버 객체 만들고 
		Member member = new Member(username, age);
		
		// save 메서드 호출해서 실제 member 객체에 반영 
		memberRepository.save(member);
		
		// modelAndView 객체 만들어서 
		ModelAndView modelAndView = new ModelAndView("save-result");
		
		// 실제 모델 필드에 set 하는거 까지 (modelAndView가 가지고 있는 addObject 메서드 써서 모델 객체에 set )
		modelAndView.addObject("member", member);
		
		return modelAndView;
		
	}
}

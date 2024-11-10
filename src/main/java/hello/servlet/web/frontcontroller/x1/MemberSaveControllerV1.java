package hello.servlet.web.frontcontroller.x1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.domain.member.MemberRepository;

public class MemberSaveControllerV1 implements ControllerV1 {

	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	public void process(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException{
		
		//username, age 로 받는 파라미터 로 member 객체 생성 
		// save 메서드 호출 시 위 결과 객체 파라미터로 넘김 
		// 요청 위엄할 jsp viewpath 지정해서 forward 
		
		
	}
}

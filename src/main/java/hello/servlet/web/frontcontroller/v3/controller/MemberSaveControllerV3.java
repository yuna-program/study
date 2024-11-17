package hello.servlet.web.frontcontroller.v3.controller;

import java.util.Map;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

public class MemberSaveControllerV3 implements ControllerV3{
	
	private MemberRepository memberRepository = MemberRepository.getInstance();
	
	@Override
	public ModelView process(Map<String, String> paramMap){
		String username = paramMap.get("username");
		int age = Integer.parseInt(paramMap.get("age"));
		
		Member member = new Member(username, age);
        memberRepository.save(member);
        
        // 모델 객체에 담는 부분
        ModelView modelView = new ModelView("save-result");
        modelView.getModel().put("member", member);
		
        return modelView;
		
	}
}
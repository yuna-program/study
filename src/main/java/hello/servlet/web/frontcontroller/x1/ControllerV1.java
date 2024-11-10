package hello.servlet.web.frontcontroller.x1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ControllerV1 {
	
	// interface 특징 : 내부에 모두 추상클래스만 포함됨 
	// 그래서 interface를 상속 받는 구현클래스에서는 무조건 interface만에 정의된 메서드를 구현해야함 
	// 코드 작성 방식 & 구조를 규격화하기 위함 
	
	void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	// 위 interface안에 서블릿과 똑같은  형태로 추상메서드 선언함 
	// 이걸 구현하는 각 컨트롤러 클래스는 
	// 회원을 화면에 보여주는 컨트롤러 클래스 
	// 회원 저장 컨트롤러 클래스 
	// 회원리스트 조회 컨트롤러 클래스 
	
	
	
}

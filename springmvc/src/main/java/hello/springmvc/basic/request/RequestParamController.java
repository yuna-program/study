package hello.springmvc.basic.request;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.springmvc.basic.HelloData;
import lombok.extern.slf4j.Slf4j;

@Slf4j // 롬복이 가지고 있는 log 사용하기 위함 
@Controller
public class RequestParamController {

	@RequestMapping("/request-param-v1")
	public void requestParamV1(HttpServletRequest request, HttpServletResponse response) throws IOException { 
		
		// 기존 방식으로 파라미터 가져오기 
		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		
		log.info("username = {} , age = {}", username , age);
		// 화면에 바로 ok 보여주기 위함 
		response.getWriter().write("ok");
		
	}
	
	@ResponseBody // view 를 반환하지 않고, http message body 에 직접 텍스트 반환
	@RequestMapping("/request-param-v2")
	public String requestParamV2(
			@RequestParam("username")String memberName,
			@RequestParam("age") int memberAge
			) {
		
		log.info("username={}, age={}", memberName, memberAge);
		
		return "ok";
		
	}
	
	@ResponseBody
	@RequestMapping("/request-param-required")
	public String requestParamRequired(
			
			// required 속성 : 파라미터 필수 여부 
			//              : 기본값이 true, false 이면 값이 안넘어와도 문제없음 
			@RequestParam(required = true, defaultValue = "guest")String username,
			@RequestParam(required = false, defaultValue = "12") Integer age
			) {
		
		log.info("username={}, age={}", username, age);
		return "ok";
		
	}
	
	@ResponseBody
	@RequestMapping("/request-param-map") // username : ee // age : 20
	public String requestParamMap(@RequestParam Map<String, Object> paramMap) { 
		
		log.info("username = {} , age={}", paramMap.get("username"), paramMap.get("age"));
		
		return "ok";
		
	}
	
	@ResponseBody
	@RequestMapping("/model-attribute-v1")
	public String modelAttributeV1(@ModelAttribute HelloData helloData, HttpServletRequest request, HttpServletResponse response) {
		
		// @ModelAttribute에 함출된 코드 
		HelloData data = new HelloData();
		data.setUsername(request.getParameter("username"));
		data.setAge(Integer.parseInt(request.getParameter("age")));
		
		// @ModelAttribute 의 동작 순서
		// HelloData 객체를 생성함 
		// 요청 파라미터 이름으로 HelloData 객체의 필드값(=프로퍼티)를 찾음 
		// 그리고 해당 프로퍼티(=필드)의 setter를 호출해서, 파라미터 값을 바인딩함 
		
		log.info("username = {}, age={}", helloData.getUsername(), helloData.getAge());
		
		return "ok";
		
	}
	
	@ResponseBody
	@RequestMapping("/model-attribute-v2")
	public String modelAttributeV2(HelloData helloData) {
		log.info("username = {}, age={}", helloData.getUsername(), helloData.getAge());
		return "ok";
	}

}

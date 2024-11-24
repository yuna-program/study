package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // 매핑 url 로 요청시 return 타입이 string 일 때 문자 그 자체를 브라우저에 반환함 
//@Controller
public class LogTestController {

	// log 출력에 필요한 객체 (slf4j 라이브러리) 
	private Logger log = LoggerFactory.getLogger(getClass());
	
//	@ResponseBody
	@RequestMapping("/log-test")
	public String logTest() {
		String name = "spring";
		
		System.out.println(name); // 실제 베포 어플리케이션에서 절때 안씀 (배포전에 모두 지움)
		
		log.info("info log = {}", name); // 메서드 파라미터 대입되는 방식으로 연산없음 
		log.info("info log = " +  name); // 이렇게는 안씀(불필요한 연산으로 메모리 낭비) 
		
		//레벨 단계
		// trace > debug > info > warn > error
		
		return "ok";
		
	}
	
}

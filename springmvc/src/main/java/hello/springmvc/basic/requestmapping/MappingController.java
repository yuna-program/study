package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// 반환값으로 뷰를 찾는게 아니라, HTTP메시지 바디에 바로 보여준다
@RestController 
public class MappingController {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping({"/hello-basic", "/hello-go"})
	public String helloBasic() {
		
		log.info("hello-basic");
		
		return "ok";
	}
	
	@GetMapping(value = "/mapping-get-v1")
	public String mappingGetV1() {
		log.info("mappingGetV1");
		
		return "ok";
	}
	
	@GetMapping("/mapping/{userId}")
	public String mappingPath(@PathVariable("userId") String data) {
		
		log.info("mappinPath userId={}", data);
		return "ok";
	}
	
	@GetMapping("/mapping/users/{userId}/orders/{orderId}")
	public String mappingPath(
			@PathVariable String userId,
			@PathVariable Long orderId
			) {
		
		log.info("mappingPath2 userId={}, orderId={}", userId, orderId);		
		return "ok";
	}
	
	@PostMapping(value = "/mapping-consume", consumes = "application/json")
	public String mappingController() {
		
		log.info("mappingController");
		
		return "ok";
	}
	
	@PostMapping(value = "/mapping-produce", produces = "text/html")
	public String mappingController2() {
		
		log.info("mappingController");
		return "ok";
	}	
	
	
}

package hello.thymeleafbasic.basic;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;
import lombok.Getter;

@Controller
@RequestMapping("/basic")
public class BasicController {
	
	// /basic/text-basic
	@GetMapping("/text-basic")
	public String textBasic(Model model) {
		model.addAttribute("data", "hello world ");
		return "basic/text-basic";
	}
	
	@GetMapping("/text-unescaped")
	public String textUnescaped(Model model) {
		model.addAttribute("data", "Hello <b>spring</b>");
		return "basic/text-unescaped";
	}
	
	@GetMapping("/variable")
	public String variable(Model model) {
		User userA = new User("userA", 10);
		User userB = new User("userB", 20);
		
		List<User> list = new ArrayList<>();
		list.add(userA);
		list.add(userB);
		
		Map<String, User> map = new HashMap<>();
		map.put("userA", userA);
		map.put("userB", userB);
		
		model.addAttribute("user", userA);
		model.addAttribute("users", list);
		model.addAttribute("userMap", map);
		
		return "basic/variable";
	}
	
	@Data
	/*
	 * 
	 * getter: 모든 필드에 대해 getter 메서드를 생성
	   setter: final이 아닌 필드에 대해 setter 메서드를 생성
	   toString(): 클래스의 필드를 포함한 문자열을 반환하는 메서드 생성
	   equals(): 객체의 동등성 비교를 위한 메서드 생성
	   hashCode(): 객체의 해시 코드를 반환하는 메서드 생성
	
	생성자관련
	
	@AllArgsConstructor: 모든 필드를 인자로 받는 생성자 생성
	@NoArgsConstructor: 기본 생성자 생성 (매개변수가 없는 생성자)
	@RequiredArgsConstructor: final 필드와 @NonNull 필드만을 인자로 받는 생성자 생성
	
	
	 * 
	 * */
	
	@Getter
	static class User {
		private String username;
		private int age;
		
		public User(String username, int age) {
			this.username = username;
			this.age = age;
		}
	}
	
	@GetMapping("/basic-objects")
	public String basicObjects(HttpSession session) {
		session.setAttribute("sessionData", "hello session");
		return "basic/basic-objects";
	}
	
	@Component("helloBean")
	static class HelloBean {
		
		public String hello(String data) {
			return "Hello" + data;
		}
		
	}
	
	@GetMapping("date")
	public String date(Model model) {
		model.addAttribute("localDateTime", LocalDateTime.now());
		return "basic/date";
		
	}
	
	@GetMapping("link")
	public String link(Model model) {
		model.addAttribute("param1", "data1");
		model.addAttribute("param2", "data2");
		return "basic/link";
		
	}
	
	@GetMapping("literal")
	public String literal(Model model) {
		model.addAttribute("data", "spring!");
		return "basic/literal";
	}
	
	@GetMapping("operation")
	public String operation(Model model) {
		model.addAttribute("nullData", null);
		model.addAttribute("data", "spring!");
		return "basic/operation";
	}
	
	@GetMapping("each")
	public String each(Model model) {
		addUsers(model);
		return "basic/each";
	}
	
	
	@GetMapping("/attribute")
	public String attribute() {
		return "basic/attribute";
	}
	
	@GetMapping("/condition")
	public String condition(Model model) {
		addUsers(model);
		return "basic/condition";
	}
	
	@GetMapping("/comments")
	public String comments(Model model) {
		model.addAttribute("data", "Spring");
		return "basic/comments";
	}

	@GetMapping("/block")
	public String block(Model model) {
		addUsers(model);
		return "basic/block";
	}
	
	@GetMapping("/javascript")
	public String javascript(Model model) {
		model.addAttribute("user", new User("userQ", 40));
		addUsers(model);
		return "basic/javascript";
	}
	
	private void addUsers(Model model) {
		List<User> list = new ArrayList<>();
		list.add(new User("userA", 10));
		list.add(new User("userB", 20));
		list.add(new User("userC", 30));
		
		model.addAttribute("users", list);
	}

}

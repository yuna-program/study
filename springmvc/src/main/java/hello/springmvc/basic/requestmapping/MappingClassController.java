package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 회원 관리를 http api 로 만든다고 생각하고 매핑을 할 것 
// 회원관리 API 
// 회원목록조회 : GET /users
// 회원등록 : POST /users
// 회원수정 : PATCH /users/{userId}
// 회원삭제 : DELETE /users/{userId}

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {
	
	// 회원목록조회 : GET /users
	@GetMapping()
	//@GetMapping(value = "/mapping/users", method = RequestMethod.GET)
	public String users() {
		
		return "get users";
		
	}
	
	// 회원등록 : POST /users
	@PostMapping()
	public String addUser() {
		
		return "post users";
		
	}
	
	// 회원수정 : PATCH /users/{userId}
	@PatchMapping("/{userId}")
	public String updatdUser(@PathVariable("userId") String userId) {
		
		return "update userId" + userId;
		
	}
	
	// 회원삭제 : DELETE /users/{userId}
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable String userId) {
		
		return "delete userId" + userId;
		
	}
}

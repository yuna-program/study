package hello.springmvc.basic;

import lombok.Data;

// 파라미터 바인딩 받을 객체
@Data
// getter, setter, toString, requiredArgsConstructor
public class HelloData {
	private String username;
	private int age;
	
	
}

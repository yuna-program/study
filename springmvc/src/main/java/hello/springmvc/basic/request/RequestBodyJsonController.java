package hello.springmvc.basic.request;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import hello.springmvc.basic.HelloData;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class RequestBodyJsonController {
	// json으로 파싱된 값을 객체 형태로 다시 파싱할때 씀
	// json과 객체 형식간의 변환을 처리하기 위한 객체
	private ObjectMapper objectMapper = new ObjectMapper();
	
	@PostMapping("/request-body-json-v1")
	public void requestBodyJsonV1(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ServletInputStream inputStream = request.getInputStream();
		String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
		
//		log.info("messageBody={}", messageBody);
		log.info(messageBody);
		
		HelloData data = objectMapper.readValue(messageBody, HelloData.class);
		
		log.info("username={}, age={}", data.getUsername(), data.getAge());
		
		response.getWriter().write("ok");
	}
	
}

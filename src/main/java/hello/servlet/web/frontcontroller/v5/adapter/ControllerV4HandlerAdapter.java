package hello.servlet.web.frontcontroller.v5.adapter;

import java.io.IOException;

import java.util.HashMap;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v4.ControllerV4;
import hello.servlet.web.frontcontroller.v5.MyHandlerAdapter;

public class ControllerV4HandlerAdapter implements MyHandlerAdapter{


	@Override
	public boolean supports(Object handler) {
		return(handler instanceof ControllerV4);
	}
	
	@Override
	public ModelView handle(HttpServletRequest request, HttpServletResponse reponse, Object handler) throws ServletException, IOException {
		ControllerV4 controller = (ControllerV4)handler;
		
		Map<String, String> paramMap = createParamMap(request);
		HashMap<String, Object> model = new HashMap<>();
		
		// 모델에 param( 사용자 입력값 ) 세팅 
		// 여기에서 어댑터로 찾을 핸들러는 String 으로 변환하지만, modelView 객체로 타입 형식을 맞춰서 반환 
		String viewName = controller.process(paramMap, model);
		ModelView modelView = new ModelView(viewName);
		
		modelView.setModel(model);
		
		return null;
	}

	private Map<String, String> createParamMap(HttpServletRequest request){
		Map<String, String> paramMap = new HashMap<>();
		request.getParameterNames().asIterator()
		.forEachRemaining(paramName -> paramMap.put(paramName, request.getParameter(paramName)));
		
		return paramMap;
	}

}

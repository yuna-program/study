package hello.thymeleafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {
	
	// /template/fragment
	@GetMapping("/fragment")
	public String template() {
		return "template/fragment/fragmentMain";
	}
	
	// /template/layout
	@GetMapping("/layout")
	public String layout() {
		return "template/layout/layoutExtendMain";
	}
	
}

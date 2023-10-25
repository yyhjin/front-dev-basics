package ch08.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class RestApiTestController {
	
	@RequestMapping("/rest")
	public String test() {
		return "rest-test";
	}
	
}

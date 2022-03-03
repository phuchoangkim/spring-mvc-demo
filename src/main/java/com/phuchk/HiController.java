package com.phuchk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HiController {
	@RequestMapping("/show-hello-world-page")
	public String showHelloWordPage() {
		return "hello-world-page";
	}
}

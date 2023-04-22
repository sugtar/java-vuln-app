package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

	@GetMapping("/")
	public String index() {
		return "Hello!";
	}

	@GetMapping("/foo")
	public String foo(@RequestParam(name="param", required=false, defaultValue="") String param) {
		String msg;

		if (param != null && param.length() > 0) {
			msg = "param: " + param;
		} else {
			msg = "No param";
		}
		return msg;
	}
}
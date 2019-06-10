package edu.cau.hzz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyController {

	@RequestMapping("/showForm")
	public String showForm() {
		System.out.println("Silly");
		return "helloworld-form";
	}
}

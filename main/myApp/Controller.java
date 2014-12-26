package myApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
	
	@RequestMapping("/home")
	public String home() {
		return "Hello World! This is an EC2 instance!";
	}
}

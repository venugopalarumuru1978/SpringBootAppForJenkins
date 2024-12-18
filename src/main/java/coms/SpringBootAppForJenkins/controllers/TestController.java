package coms.SpringBootAppForJenkins.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/testurl/{sname}")
	public String Testmethod1(@PathVariable("sname") String sname)
	{
		return sname + " hello World";
	}
}

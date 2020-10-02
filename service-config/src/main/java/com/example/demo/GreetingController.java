  package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	static {
		System.out.println("Controller Loaded");
	}
	@Value("${my.greeting :default value}")
	private String greet;
	
	@Value("${my.list.greeting}")
	private List<String> greetingList;
	
	@Value("#{${dbvalues}}")
	private Map<String, String> dbMap;
	
	@Autowired
	private DbSettings dbSettings;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greeting")
	public String greetings() {
		return greet+" My Greeting List "+greetingList +
				"dbValue "+dbMap+
				"DBSettings URL: "+dbSettings.getUrl()+" Username :"+dbSettings.getUserName();
	}
	
	
	@GetMapping("/env")
	public String envSpecif() {
		return env.toString() +" active profiles "+Arrays.toString(env.getActiveProfiles())+env.getProperty("mysql.url");
				
	}
}

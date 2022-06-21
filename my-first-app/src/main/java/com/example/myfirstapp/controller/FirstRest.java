package com.example.myfirstapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/first")
public class FirstRest {
	@GetMapping
	public String greetings() {
		return "Welcome to rest";
	}
	@GetMapping("/hello")
	public Map<String, String> getComplex(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Alexander");
		map.put("email", "alexander123@abc.com");
		return map;
	}
	
	@PostMapping("/hello")
	public Map<String, String> postComplex(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("Message", "Hello post");
		return map;
	}
	
	@PutMapping("/hello")
	public Map<String, String> putComplex(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("Message", "Hello put");
		return map;
	}
	
	@DeleteMapping("/hello")
	public Map<String, String> deleteComplex(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("Message", "Hello delete");
		return map;
	}

}

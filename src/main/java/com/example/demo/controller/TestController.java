package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.TestMapper;

@Controller
public class TestController {
	
	@Autowired
	private TestMapper testMapper;
	
	@ResponseBody
	@GetMapping("/test")
	public List <HashMap<String, Object>> test(){
		return testMapper.findAll();
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

}

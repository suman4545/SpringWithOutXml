package com.test.config;

import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	@GetMapping(path="/getres",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response>getData(){
		Response res=new Response();
		res.setCode("100");
		res.setMsg("Hi Spring WithOut Xml.This is a get method");
		return ResponseEntity.ok(res);
		
	}
	
	@PostMapping(path="/postdata",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response>PostData(RequestEntity<Request>reqBody){
		Response res=new Response();
		res.setCode("100");
		res.setMsg("Hi Spring WithOut Xml.Posted Data:"+reqBody.getBody().getName());
		return ResponseEntity.ok(res);
		
	}
	
	@GetMapping("/")
	public ModelAndView getHome() {
		ModelAndView mv=new ModelAndView("index");
		return mv;
		
	}
	
	@GetMapping("/getHomePage")
	public ModelAndView getHomepage() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
		
	}
	
	
	
	
	

}

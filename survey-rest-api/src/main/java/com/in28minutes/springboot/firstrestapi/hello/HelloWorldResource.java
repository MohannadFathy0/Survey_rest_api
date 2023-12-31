package com.in28minutes.springboot.firstrestapi.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldResource {

	@RequestMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@RequestMapping("/hello-world-bean/path-param/{name}/massege/{massege}")
	public HelloWorldBean helloWorldpathParam(@PathVariable String name, @PathVariable String massege) {
		return new HelloWorldBean("Hello World " + name + ", " + massege);
	}
}

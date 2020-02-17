package com.wj.autoConfigure_demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
public class GreetingApplicationRunner implements ApplicationRunner{

	private String name;

	public GreetingApplicationRunner(){
		this("wangjie_demo");
	}
	public GreetingApplicationRunner(String name){
		this.name = name;
		log.info("Initializing GreetingApplicationRunner for {}",name);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
          log.info("Hello everyone!We all like Spring~~~");
	}
}

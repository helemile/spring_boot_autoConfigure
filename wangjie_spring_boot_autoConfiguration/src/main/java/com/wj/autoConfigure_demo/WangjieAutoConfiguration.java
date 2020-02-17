package com.wj.autoConfigure_demo;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(GreetingApplicationRunner.class)
public class WangjieAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(GreetingApplicationRunner.class)
    @ConditionalOnProperty(name = "wangjie.enabled",havingValue = "true",matchIfMissing = true)
	public GreetingApplicationRunner greetingApplicationRunner(){
	    return  new GreetingApplicationRunner("auto_name");
    }

}

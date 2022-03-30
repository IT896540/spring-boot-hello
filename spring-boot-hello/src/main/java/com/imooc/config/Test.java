package com.imooc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac =new AnnotationConfigApplicationContext (SpringConfiguration.class);
		System.out.println(ac.getBean(ConfigService.class));
	}
}

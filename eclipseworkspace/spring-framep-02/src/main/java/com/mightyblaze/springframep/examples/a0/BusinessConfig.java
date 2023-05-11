package com.mightyblaze.springframep.examples.a0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessConfig {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(BusinessConfig.class)){
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}

	}

}

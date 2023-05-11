package com.mightyblaze.springframep.examples.a2;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		}
		
		 
		 
	}

}
 
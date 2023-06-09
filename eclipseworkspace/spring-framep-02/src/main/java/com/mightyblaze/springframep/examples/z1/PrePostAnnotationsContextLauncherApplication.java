package com.mightyblaze.springframep.examples.z1;

import java.security.PublicKey;
import java.util.Arrays;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependencies are Ready!");
	}   @PostConstruct
		public void initialize() {
			someDependency.getReady();
		}
		@PreDestroy
		public void cleanup() {
			System.out.println("Clean up ");
		}
}
@Component
class SomeDependency{

	public void getReady() {
		System.out.println("Some logic using SomeDependency");
	}
	
}



@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		}
		
		 
		 
	}

}
 
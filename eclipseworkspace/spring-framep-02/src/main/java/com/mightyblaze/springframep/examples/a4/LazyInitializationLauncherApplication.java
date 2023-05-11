package com.mightyblaze.springframep.examples.a4;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization Logic");
		this.classA = classA;
	}
	public void doSomething() {
		System.out.println("Do something.");
	}
}


@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
		System.out.println("Initialization of context is completed.");
		context.getBean(ClassB.class).doSomething();
		}
		
		 
		 
	}

}
 
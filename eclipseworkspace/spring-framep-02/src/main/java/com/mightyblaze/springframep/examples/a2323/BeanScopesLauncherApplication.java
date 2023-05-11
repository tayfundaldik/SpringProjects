package com.mightyblaze.springframep.examples.a2323;

import java.util.Arrays;

import javax.swing.text.AbstractDocument.Content;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
@Component
class NormalClass{
	
}
@Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
class PrototypeClass{
	
}


@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
		
		}
		
		 
		 
	}

}
 
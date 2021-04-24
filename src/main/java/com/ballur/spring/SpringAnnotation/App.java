package com.ballur.spring.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main( String[] args )
	{

		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
		Samsung s7 = (Samsung) cxt.getBean(Samsung.class);
		s7.config();

	}
}

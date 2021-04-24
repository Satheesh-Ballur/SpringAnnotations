package com.ballur.spring.SpringAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SnapDragon implements MobileProcesscor {

	public void process() 
	{
	
		System.out.println("Im the best processcor");

	}

}

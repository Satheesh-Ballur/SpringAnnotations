package com.ballur.spring.SpringAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MediaTek implements MobileProcesscor {

	public void process() {
		System.out.println("Im the 2nd best processcor");

	}

}

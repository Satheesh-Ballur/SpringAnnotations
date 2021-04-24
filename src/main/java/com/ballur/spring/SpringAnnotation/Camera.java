package com.ballur.spring.SpringAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Camera 
{

	private int pixel;

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	@Override
	public String toString() {
		return "Camera [pixel=" + pixel + "]";
	}
	
	
	
}

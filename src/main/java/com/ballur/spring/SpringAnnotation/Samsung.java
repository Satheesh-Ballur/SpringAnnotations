package com.ballur.spring.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung 
{
	@Autowired
	@Qualifier("snapDragon")
	private MobileProcesscor cpu;
	
	@Autowired
	private Camera cam;
	
	
	public Camera getCam() {
		return cam;
	}



	public void setCam(Camera cam) {
		this.cam = cam;
	}



	public MobileProcesscor getCpu() {
		return cpu;
	}



	public void setCpu(MobileProcesscor cpu) {
		this.cpu = cpu;
	}



	public void config()
	{
		System.out.println("Im Samsung");
		cpu.process();
		cam.setPixel(10);
		System.out.println(cam);
	}
	
}

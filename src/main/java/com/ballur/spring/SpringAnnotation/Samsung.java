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
	}
	
}

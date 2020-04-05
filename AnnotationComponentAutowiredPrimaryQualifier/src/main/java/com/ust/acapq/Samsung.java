package com.ust.acapq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mySamsung")//default "samsung" :-> Non qua;ified and de capitalized.
public class Samsung {
	
	@Autowired
	MobileProcessor cpu;
	
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}



	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}



	public void config() {
		System.out.println("octa core, 4 gb");
		cpu.process();
	}
}

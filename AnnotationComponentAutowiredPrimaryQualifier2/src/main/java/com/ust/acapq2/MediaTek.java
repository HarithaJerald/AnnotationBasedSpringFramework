package com.ust.acapq2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary instead of this annotation we can use @Qulifier in autowiring 
public class MediaTek implements MobileProcessor {

	public void process() {

		System.out.println("2nd best cpu");

	}

}

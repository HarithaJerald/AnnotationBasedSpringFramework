package com.ust.AnnotationBasedConfiguration;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void drive() {
		System.out.println("driving!!!");
	}
}

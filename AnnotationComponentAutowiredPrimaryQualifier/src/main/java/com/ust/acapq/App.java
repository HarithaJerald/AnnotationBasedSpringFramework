package com.ust.acapq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.acapq.AppConfig;
import com.ust.acapq.Samsung;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung obj = (Samsung)context.getBean("mySamsung");
    	obj.config();
    }
}

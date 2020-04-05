package com.ust.acapq2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ust.acapq2.AppConfig;
import com.ust.acapq2.Samsung;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung obj = (Samsung)context.getBean("mySamsung");
    	obj.config();
    }
}

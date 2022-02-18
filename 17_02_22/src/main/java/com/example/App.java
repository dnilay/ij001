package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Coach;
import com.example.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   
    	   ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    	   Coach myCoach=applicationContext.getBean("theCoach",Coach.class);
    	   Person person=applicationContext.getBean("person",Person.class);
    	   System.out.println(myCoach.getDailyworkout());
    	   System.out.println(myCoach.getDailyFortune());
    	   System.out.println(person);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}

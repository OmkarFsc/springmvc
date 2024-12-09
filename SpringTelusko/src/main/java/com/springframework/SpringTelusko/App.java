package com.springframework.SpringTelusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	
    	Tyre t=(Tyre)context.getBean("tyre");
    	System.out.println(t);  
    	
    	
//       Vehicle obj=(Vehicle)context.getBean("bike"); //---->Interface
//       obj.drive();
    	
//    	Car obj=(Car) context.getBean("car");  //-----> Car
//    	obj.drive();
    	
    	Bike obj=(Bike) context.getBean("bike"); //---->Bike
    	obj.drive();
    }
}

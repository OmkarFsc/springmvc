package com.Annot.SpringAnnot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Samsung s7=factory.getBean(Samsung.class);
    	
    	s7.setMessage("Hello Omkar welcome to Spring");
    	s7.getMessage();
    }
}

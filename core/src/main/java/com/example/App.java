package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     //IoC
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	//by using IoC Object we are requesting the IoC to supply object for airtel class
    	 Airtel airtel = ac.getBean(Airtel.class);
 //   	Airtel airtel=new Airtel(); instead of writing this
    	airtel.DataTypeOfSim();
    	airtel.TypeOfSim();
    	System.out.println(airtel.getDataStrength());
    	//airtel.getDataStrength();// not getting output
    	Idea idea=ac.getBean(Idea.class);
 //   	Idea idea = new Idea();
    	idea.DataTypeOfSim();
    	idea.TypeOfSim();
    	idea.displayStrength(); 
    }
}

package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
//        Capacino cap=ac.getBean(Capacino.class);
//        cap.typeOfCoffee();
//        cap.rateOfCoffee();
      Xpreso xpre=ac.getBean(Xpreso.class);
         xpre.typeOfCoffee();
          xpre.rateOfCoffee();
        Capacino coffee=ac.getBean(Capacino.class); 
          coffee.typeOfCoffee();
          System.out.println(coffee.getCream());
        		
    }
}

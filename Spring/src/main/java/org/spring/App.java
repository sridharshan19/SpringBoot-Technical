package org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("javaconfig.xml");
        //Engine en =context.getBean("st1");
        //en.eng();
        Bike b=(Bike)context.getBean("b1");
       // b.setAge(25); //the value for the age has been initiazed in javaconfig.xml.//property that assign value the getter
        //System.out.println(b.getAge() + " "+b.getRoll_no());
        //b.ride();
        b.work(); //have used with ref in the property with help of "St1" class.

    }
}

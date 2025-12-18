package org.lombok;

import org.lombok.Config.Myconfiguration;
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
        ApplicationContext context= new AnnotationConfigApplicationContext(Myconfiguration.class);
        Student s2=context.getBean(Student.class);
        s2.write();

    }
}

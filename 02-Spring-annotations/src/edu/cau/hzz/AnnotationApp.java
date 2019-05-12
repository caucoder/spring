package edu.cau.hzz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AnnotationApp
 */
public class AnnotationApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach coach1 = context.getBean("trackCoach", Coach.class);
        Coach coach2 = context.getBean("trackCoach", Coach.class);

        System.out.println("Point to the same memory address: " + (coach1 == coach2));

        System.out.println(((TrackCoach) coach1).getEmail());
        context.close();

    }
}
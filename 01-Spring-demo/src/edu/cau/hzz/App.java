package edu.cau.hzz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // get beans for container
        Coach coach1 = context.getBean("myCoach", Coach.class);
        Coach coach2 = context.getBean("myCoach", Coach.class);

        // test bean scope
        boolean result = coach1 == coach2;
        System.out.println("Pointing to the same object: " + result);
        System.out.println("Memory location for the coach1: " + coach1);
        System.out.println("Memory location for the coach2: " + coach2);

        // use method

        // close container
        context.close();

    }
}
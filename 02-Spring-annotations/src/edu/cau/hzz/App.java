package edu.cau.hzz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // get beans for container
        Coach coach = context.getBean("myCoach", Coach.class);

        // use method
        System.out.println(coach.getDailyWorkOut());
        // close container
        context.close();

    }
}
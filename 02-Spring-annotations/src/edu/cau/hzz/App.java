package edu.cau.hzz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // get beans for container
        Coach coach = context.getBean("trackCoach", Coach.class);

        // use method
        System.out.println(coach.getDailyFortune());
        // close container
        context.close();

    }
}
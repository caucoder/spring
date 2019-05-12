package edu.cau.hzz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * TrackCoach
 */

@Component
@Scope("singleton")
@PropertySource("classpath:sport.properties")
public class TrackCoach implements Coach {

    // inject properties
    @Value("${foo.email}")
    private String email;

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Autowired
    public TrackCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Just Do it.Focus your goals";
    }

    @Override
    public String getDailyFortune() {
        return "TrackCoach: " + fortuneService.getFortune();
    }

    @PostConstruct
    public void doStartupStuff() {
        System.out.println(">> Inside doStartupStuff() method");
    }

    @PreDestroy
    public void doDestroyStuff() {
        System.out.println(">> Inside doDestroyStuff() method");
    }

    public String getEmail() {
        return this.email;
    }

}
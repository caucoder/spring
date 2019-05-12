package edu.cau.hzz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * TrackCoach
 */

@Component
@Scope("singleton")
public class TrackCoach implements Coach {

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

}
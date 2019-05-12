package edu.cau.hzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * TrackCoach
 */

@Component
public class TrackCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /**
     * @Autowired public TrackCoach(@Qualifier("randomFortuneService")
     *            FortuneService fortuneService) { this.fortuneService =
     *            fortuneService; }
     */

    @Override
    public String getDailyWorkOut() {
        return "Just Do it.Focus your goals";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
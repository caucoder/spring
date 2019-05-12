package edu.cau.hzz;

import org.springframework.stereotype.Component;

/**
 * TrackCoach
 */

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Just Do it.Focus your goals";
    }

}
package edu.cau.hzz;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * RandomService
 */
@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = { "Focus your goals", "Happy coding", "Use computer to make life easier" };

    @Override
    public String getFortune() {
        Random random = new Random();
        String result = data[random.nextInt(data.length)];
        return result;
    }

}
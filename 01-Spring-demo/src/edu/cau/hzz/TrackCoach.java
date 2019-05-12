package edu.cau.hzz;

/**
 * TrackCoach
 */
public class TrackCoach implements Coach {

    // define private field for depency
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("TrackCoach: inside constructor");
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkOut() {
        return "Just Do it.Focus your goals";
    }

    // bean lifecycle method
    public void doMyStartupStuff() {
        String sentence = "TrackCoach: inside method doMyStartupStuff";
        System.out.println(sentence);
    }

    public void doMyDestroyStuff() {
        String sentence = "TrackCoach: inside method doMyDestroyStuff";
        System.out.println(sentence);
    }

}
package Person;

public class FootballMan extends Person implements Game {
    @Override
    public void startPlaying() {
        System.out.println("I like to play football!");
    }
}

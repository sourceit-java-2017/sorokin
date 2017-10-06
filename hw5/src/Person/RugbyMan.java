package Person;

public class RugbyMan extends Person implements Game {
    @Override
    public void startPlaying() {
        System.out.println("I play rugby every weekend!");
    }
}

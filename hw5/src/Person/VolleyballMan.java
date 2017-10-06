package Person;

public class VolleyballMan extends Person implements Game {
    @Override
    public void startPlaying() {
        System.out.println("I play volleyball two times a week");
    }
}

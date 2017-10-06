package Person;

public class Guard extends Person implements Salary {
    @Override
    public void income() {
        System.out.println("You are security guard and get 5000$ per month");
    }
}

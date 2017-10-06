package Person;

public class Manager extends Person implements Salary {

    @Override
    public void income() {
        System.out.println("You are the BOSS and get $10000 per month");
    }
}

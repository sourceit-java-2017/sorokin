package Person;

public class Worker extends Person implements Salary {
    @Override
    public void income() {
        System.out.println("You are a regular worker and get $7000 per month");
    }
}

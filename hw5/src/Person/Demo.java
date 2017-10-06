package Person;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory salaryFactory = FactoryProducer.getFactory("salary");
        AbstractFactory gameFactory = FactoryProducer.getFactory("game");

        Salary person1 = salaryFactory.getSalaryByJob("manager");
        person1.income();

        Salary person2 = salaryFactory.getSalaryByJob("guard");
        person2.income();

        Game person3 = gameFactory.getGameByHobby("football");
        person3.startPlaying();

        Game person4 = gameFactory.getGameByHobby("rugby");
        person4.startPlaying();
    }
}

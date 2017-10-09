package Person;

public abstract class AbstractFactory {
    abstract Salary getSalaryByJob(String job);
    abstract Game getGameByHobby(String hobby);
}

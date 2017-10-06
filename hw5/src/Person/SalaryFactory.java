package Person;

public class SalaryFactory extends AbstractFactory {
    @Override
    Salary getSalaryByJob(String job) {
        if (job == null) {
            return null;
        }

        if (job.equalsIgnoreCase("MANAGER")) {
            return new Manager();

        } else if (job.equalsIgnoreCase("WORKER")) {
            return new Worker();

        } else if (job.equalsIgnoreCase("GUARD")) {
            return new Guard();
        }

        return null;
    }

    @Override
    Game getGameByHobby(String hobby) {
        return null;
    }
}

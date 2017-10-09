package Person;

public class GameFactory extends AbstractFactory {
    @Override
    Salary getSalaryByJob(String job) {
        return null;
    }

    @Override
    Game getGameByHobby(String hobby) {
        if (hobby == null) {
            return null;
        }

        if (hobby.equalsIgnoreCase("VOLLEYBALL")) {
            return new VolleyballMan();

        } else if (hobby.equalsIgnoreCase("FOOTBALL")) {
            return new FootballMan();

        } else if (hobby.equalsIgnoreCase("RUGBY")) {
            return new RugbyMan();
        }

        return null;
    }
}

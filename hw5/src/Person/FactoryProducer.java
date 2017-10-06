package Person;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice == null) {
            return null;
        }

        if(choice.equalsIgnoreCase("SALARY")){
            return new SalaryFactory();

        }else if(choice.equalsIgnoreCase("GAME")){
            return new GameFactory();
        }

        return null;
    }
}

package Bike;

public class Demo {
    public static void main(String[] args) {
        BikeFactory bikeFactory = new BikeFactory();

        Rider john = bikeFactory.getBikeByType("SPORT");
        john.start();
        john.speedUp();
        System.out.println(john.getCurrentSpeed());
        john.stop();
    }
}


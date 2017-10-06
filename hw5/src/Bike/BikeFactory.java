package Bike;

public class BikeFactory {
    public Rider getBikeByType(String type) {

        if (type.equalsIgnoreCase("COMFORT")) {
            return new Cannondale();
        } else if (type.equalsIgnoreCase("SPORT")) {
            return new Cube();
        } else if (type.equalsIgnoreCase("TOURISM")) {
            return new Ghost();
        }

        return null;
    }
}

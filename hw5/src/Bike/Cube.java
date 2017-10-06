package Bike;

public class Cube extends Bike implements Rider {
    private int wheel;
    private int gears;
    private String breaks;
    private String size;
    private String color;
    private static int speed = 2;
    public static String name = "Bike.Cube";

    public Cube () {
        wheel = 13;
        gears = 14;
        breaks = "Hydraulic";
        size = "Large";
        color = "black";
    }

    public Cube (String size, String color) {
        setSize(size);
        this.color = color;
        wheel = 13;
        gears = 14;
        breaks = "Mechanic";
    }

    public Cube(int wheel, int gears) {
        setWheel(wheel);
        this.gears = gears;
    }


    public void setWheel(int wheel) {
        if (isWheelFit(wheel)) {
            this.wheel = wheel;
        } else {
            System.out.println("Select size between 21 & 29");
        }
    }

    public int getWheel() {
        return wheel;
    }

    private boolean isWheelFit(int wheelSize) {
        return wheelSize > 20 && wheelSize < 30;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setBreaks(String breaks) {
        if (isBreakTypeValid(breaks)) {
            this.breaks = breaks;
        } else {
            System.out.println("Break type is invalid(Mechanic/Hydraulic)");
        }
    }

    public String getBreaks() {
        return breaks;
    }

    private boolean isBreakTypeValid(String brakeType) {
        return brakeType.toUpperCase().equals("HYDRAULIC") ||
                brakeType.toUpperCase().equals("MECHANIC");
    }

    public void setSize(String size) {
        this.size = convertSize(size);
    }

    public void setSize(int height) {
        if (height > 0 && height < 150) {
            this.size = "Small";
        } else if (height > 149 && height < 180) {
            this.size = "Medium";
        } else if (height > 179) {
            this.size = "Large";
        }
    }

    public String getSize() {
        return size;
    }

    private String convertSize(String size) {
        switch (size) {
            case "S":
                return "Cu";
            case "M":
                return "Cub";
            case "L":
                return "Bike.Cube";
            case "XL":
                return "Xtra Bike.Cube";
            default:
                return "Standard";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



    @Override
    public void start() {
        speed = 10;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }

    @Override
    public void speedUp() {
        System.out.println("Your CUBE speed is higher: " + ++speed);
    }

    @Override
    public void slowDown() {
        System.out.println("Your CUBE speed is slower: " + --speed);
    }
}

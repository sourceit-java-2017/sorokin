import java.util.Calendar;

public class Cannondale extends Bike {
    private int wheel;
    private int gears;
    private String breaks;
    private String size;
    private String color;
    private static int wheelsNum = 2;
    private static String wheelsForm = "Circle";

    public Cannondale () {
        wheel = 26;
        gears = 28;
        breaks = "Hydraulic";
        size = "Large";
        color = "black";
    }

    public Cannondale (String size, String color) {
        setSize(size);
        this.color = color;
        wheel = 26;
        gears = 28;
        breaks = "Hydraulic";
    }

    public Cannondale(int wheel, int gears) {
        setWheel(wheel);
        this.gears = gears;
    }

    public void setWheel(int wheel) {
        if (isWheelFit(wheel)) {
            this.wheel = wheel;
        } else {
            System.out.println("Select size between 26 & 29");
        }
    }

    public void setWheel (int wheelSize, int rodsNum) {
        if (rodsNum > 18) {
            this.wheel = wheelSize + 1;
        } else {
            this.wheel = wheelSize;
        }
    }

    public int getWheel() {
        return wheel;
    }

    private boolean isWheelFit(int wheelSize) {
        return wheelSize > 25 && wheelSize < 30;
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

    public String getSize() {
        return size;
    }

    private String convertSize(String size) {
        switch (size) {
            case "S":
                return "Small";
            case "M":
                return "Medium";
            case  "L":
                return "Large";
            case  "XL":
                return "Xtra Large";
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

}

package Bike;

public class Bike {
    protected int wheel;
    protected int gears;
    protected String breaks;
    protected String size;
    protected String color;
    protected String name;

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public String getBreaks() {
        return breaks;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    final Class<? extends Bike> getBikeClass(Bike bikeObj) {
        return bikeObj.getClass();
    }

    public double getMaxSpeed() {
        return wheel/3 + Math.sqrt(gears);
    }

}

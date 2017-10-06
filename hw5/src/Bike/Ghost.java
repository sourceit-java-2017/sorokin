package Bike;

public class Ghost extends Bike implements Rider {
    public int speed;

    @Override
    public void start() {
        speed = 5;
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
        System.out.println("You are doing well, your GHOST speed is " + ++speed);
    }

    @Override
    public void slowDown() {
        System.out.println("You are slowing down, your GHOST speed is " + --speed);
    }
}


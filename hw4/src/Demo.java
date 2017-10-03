public class Demo {
    public static void main(String[] args) {
        Bike general = new Bike();
        Cannondale five = new Cannondale();
        Cube ltd = new Cube();

        general.setWheel(23);
        System.out.println(general.getWheel());

        five.setWheel(24,36);
        five.getWheel();

        ltd.setColor("black");
        ltd.setSize("M");
        ltd.setBreaks("HYDRAULIC");

        System.out.println(ltd.getColor() + ltd.getSize() + ltd.getBreaks());

        System.out.println((ltd.getClass()));
    }
}


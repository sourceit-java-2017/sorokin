public class Nod {
    public static void main(String[] args) {
        if (args.length >= 1) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(getGsd(a, b));
        }
    }

    public static int getGsd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int c = a % b;
        return getGsd(b, c);
    }
}

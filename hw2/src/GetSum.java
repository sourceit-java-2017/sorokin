import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        System.out.println("Please, enter number to get a sum of digits: ");
        Scanner scanner = new Scanner(System.in);
        String digits = scanner.nextLine();
        int sum = 0;
        for (char n : digits.toCharArray()) {
            int num = Character.getNumericValue(n);
            sum += num;
        }
        System.out.println(sum);
    }
}

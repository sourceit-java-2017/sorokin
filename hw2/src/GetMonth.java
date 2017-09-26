import java.time.Month;
import java.util.Scanner;

public class GetMonth {
    public static void monthName() {
        System.out.println("Please, enter the month number: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int monthsNum = Integer.valueOf(text);
        if (monthsNum > 0 && monthsNum < 13) {
            System.out.println(Month.of(monthsNum).name());
        } else {
            System.out.println("You should enter a number between 1 and 12.");
        }
    }
}
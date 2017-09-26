import java.util.Scanner;

public class GetExcelColumn {

    private static String getColumnName(int number) {
        StringBuilder result = new StringBuilder();
        while (number-- > 0) {
            result.append((char)('A' + (number % 26)));
            number /= 26;
        }
        return result.reverse().toString();
    }

    private static int getColumnNumber(String name) {
        int number = 0;
        int j = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            number += Math.pow(26, i) * (name.charAt(j--) - ('A' - 1));
        }
        return number;
    }

    public static void excel() {
        System.out.println("Enter the column number: ");
        Scanner scanner = new Scanner(System.in);
        int cNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(getColumnName(cNumber));

        System.out.println("Enter the column name: ");
        String cName = scanner.nextLine().toUpperCase();
        System.out.println(getColumnNumber(cName));

        System.out.println("Enter name of the left column: ");
        String leftColName = scanner.nextLine().toUpperCase();
        System.out.println(getColumnName(getColumnNumber(leftColName) + 1));
    }
}

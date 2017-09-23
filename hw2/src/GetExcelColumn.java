import java.util.Scanner;

public class GetExcelColumn {

    private static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private static String getColumnName(int number) {
        String firstLetter = Character.toString(alphabet[number / 26]);
        String secondLetter = Character.toString(alphabet[number % 26]);
        return firstLetter + secondLetter;
    }

    private static int getColumnNumber(String name) {
        char firstChar = name.charAt(0);
        char secondChar = name.charAt(1);
        int firstNum = 0;
        int secondNum = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (firstChar == alphabet[i]) {
                firstNum = i;
            }
            if (secondChar == alphabet[i]) {
                secondNum = i;
            }
        }

        return firstNum * 26 + secondNum; //TODO
    }

    public static void main(String[] args) {
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

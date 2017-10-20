import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        UpperCaseText.writeUpperCaseText();
        SortedArray.writeSortedArray();

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                " Cras sollicitudin dapibus mattis. Proin eget ultrices eros. " +
                "Nullam rhoncus nisi sed porttitor tristique. Mauris lectus sem, " +
                "gravida varius orci sed, fringilla bibendum ex. Aliquam dignissim " +
                "vitae ligula at porttitor. Ut nec dui lectus. Maecenas vestibulum metus" +
                " nec neque ornare, bibendum sodales velit porta. Etiam faucibus vitae " +
                "urna in mollis. Morbi dictum augue sit amet nibh pellentesque, vitae " +
                "suscipit odio ornare. Nulla facilisi.";
        SplitSentences.parseSentences(text);
        System.out.println("Number of unique words: " + SplitSentences.getNumOfUniqueWords(text));

        System.out.println("Enter data type: ");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        FilterData.getDataByType(type);
    }
}

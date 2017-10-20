import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedArray {
    public static void writeSortedArray() {
        try {
            BufferedReader input = new BufferedReader(new FileReader("resources\\array"));
            BufferedWriter output = new BufferedWriter(new FileWriter("resources\\sortedArray.txt"));

            String line;

            while ((line = input.readLine()) != null) {
                String[] strArray = line.split(",");
                int[] numbers = new int[strArray.length];
                for(int i = 0; i < strArray.length; i++) {
                    numbers[i] = Integer.parseInt(strArray[i]);
                }
                Arrays.sort(numbers);
                for (int num : numbers) {
                    output.write(num + ",");
                }
                output.newLine();
            }
            input.close();
            output.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open text file");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

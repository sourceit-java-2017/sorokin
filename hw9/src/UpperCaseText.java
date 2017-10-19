import java.io.*;

public class UpperCaseText {
    public static void writeUpperCaseText() {
        try {
            BufferedReader input = new BufferedReader(new FileReader("resources\\text"));
            BufferedWriter output = new BufferedWriter(new FileWriter("resources\\upperText.txt"));

            String line;
            while ((line = input.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.equals(word.toLowerCase())) {
                        word = word.toUpperCase();
                    }
                    output.write(word);
                    output.write(" ");
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

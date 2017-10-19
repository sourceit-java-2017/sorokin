import java.text.BreakIterator;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class SplitSentences {
    public static void parseSentences(String text) {
        BreakIterator iterator =
                BreakIterator.getSentenceInstance(Locale.US);

        iterator.setText(text);

        int lastIndex = iterator.first();
        while (lastIndex != BreakIterator.DONE) {
            int firstIndex = lastIndex;
            lastIndex = iterator.next();

            if (lastIndex != BreakIterator.DONE) {
                String sentence = text.substring(firstIndex, lastIndex);
                System.out.println(sentence);
            }
        }
    }

    public static int getNumOfUniqueWords(String text) {
        String[] arr = text.split(" ");
        Set<String> listOfWords = new HashSet<>();
        for (String word : arr) {
            listOfWords.add(word.replaceAll("[^A-Za-z0-9]", ""));
        }
        return listOfWords.size();
    }
}

package counter;

import java.util.HashMap;
import java.util.Map;

public class Counter {
    public static Map<Character, Integer> countLetters(String text) {
        if (text == null) {
            throw new NullPointerException("Text is null!");
        }

        Map<Character, Integer> result = new HashMap<>();
        for(int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if(Character.isLetter(ch)) {
                if(result.containsKey(ch)) {
                    result.put(ch, result.get(ch) + 1);
                } else {
                    result.put(ch, 1);
                }
            }
        }
        return result;
    }
}

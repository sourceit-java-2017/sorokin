package demonstration;

import counter.Counter;
import iImpl.SmartableImpl;
import interfaces.Smartable;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        String text = "The BBC's Ireland correspondent, Chris Page, said it would be the most severe storm to hit Ireland in half a century.\n" +
                "Met Eireann has recorded gusts of 92mph (148km/h) at Fastnet Rock, off the south coast of Ireland.\n" +
                "Ophelia is on its way from the Azores in the Atlantic Ocean and it comes 30 years after the UK's Great Storm of 1987.";

        Map<Character, Integer> letters = Counter.countLetters(text);
        for (Character key : letters.keySet()) {
            System.out.print(key + ":" + letters.get(key) + "; ");
        }
        System.out.println();

        //Smartable - is Unique?

        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");
        map.put("Вадимка", "Викторов");
        map.put("Вадимыч", "Викторов");
        Smartable smartable = new SmartableImpl();

        System.out.println(smartable.isUnique(map));

        //Smartable - intersect

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", null);
        map1.put("Alyssa", 100);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 88);
        map1.put("Kim", 52);
        map1.put("Sylvia", 95);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie", 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);

        System.out.println(smartable.intersect(map1, map2));

        //Smartable - removeEvenLength

        Set<String> set = new HashSet<>();
        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("!");
        set.add("dude");

        System.out.println(smartable.removeEvenLength(set));

    }
}

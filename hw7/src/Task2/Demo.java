package Task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("test");
        list.add("test");
        list.add("tester");
        list.add("tester");
        list.add("testing");
        list.add("testing");
        list.add("code");
        list.add("code");

        System.out.println("Old list: ");
        for (String s: list) {
            System.out.println(s);
        }

        List<String> newList = new ArrayList<>(new HashSet<>(list));

        System.out.println("New list(unique): ");
        for(String s: newList) {
            System.out.println(s);
        }

    }
}

package Task3;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Tools tool = new Tools();
        ArrayList list = new ArrayList<Integer>();

        int[] arr = {0, 0, 2, 10, 10, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16};

        for(int num: arr) {
            list.add(num);
        }

        System.out.println("old list: ");
        for(Object elem: list ) {
            System.out.print(elem);
            System.out.print(" ");
        }

        List<Integer> newList = tool.removeInRange(list, 0, 5, 13);

        System.out.println("\nnew list:");
        for(Integer elem: newList) {
            System.out.print(elem);
            System.out.print(" ");
        }


        System.out.println("\n Common numbers count: " + tool.countCommon(list, newList));

        System.out.println("Max occurences: " + tool.maxOccurrences(list));
    }
}

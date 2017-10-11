package Task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    ArrayList<String> arrMillion = new ArrayList<>(1000000);
    LinkedList<String> linkMillion = new LinkedList<>();

    Task1() {
        for (int i = 0; i < 1000000; i++) {
            arrMillion.add("test" + i);
            linkMillion.add("test" + i);
        }
    }

    public void deleteArrListElements() {
        long startTime = System.currentTimeMillis();
        for (int i = 500499; i > 499499; i--) {
            arrMillion.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Delete 1000 elems from ArrayList took " + (endTime - startTime) + " milliseconds");
    }

    public void addArrListElements() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrMillion.add(i, "test" + i * 2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Add 1000 elems to ArrayList took " + (endTime - startTime) + " milliseconds");
    }

    public void printArrListElements() {
        long startTime = System.currentTimeMillis();
        for (int i = 499995; i < 500005; i++) {
            System.out.println(arrMillion.get(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("PrintOut 10 elems from ArrayList took " + (endTime - startTime) + " milliseconds");
    }


    public void deleteLinkListElements() {
        long startTime = System.currentTimeMillis();
        for (int i = 500499; i > 499499; i--) {
            linkMillion.remove(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Delete 1000 elems from LinkedList took " + (endTime - startTime) + " milliseconds");
    }

    public void addLinkListElements() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkMillion.add(i, "test" + i * 2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Add 1000 to LinkedList took " + (endTime - startTime) + " milliseconds");
    }

    public void printLinkListElements() {
        long startTime = System.currentTimeMillis();
        for (int i = 499995; i < 500005; i++) {
            System.out.println(linkMillion.get(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("PrintOut 10 elems from LinkedList took " + (endTime - startTime) + " milliseconds");
    }


}

package demo;

import exceptions.MyException;
import task3.UtilityClass;
import task4.BinarySearch;

public class Demo {
    public static void main(String[] args) {
        UtilityClass.getElementByIndex(new Object[0], 1);
        try {
            UtilityClass.throwIRExc();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        BinarySearch search = new BinarySearch(10);
        System.out.println(search.contains(50));
    }

}

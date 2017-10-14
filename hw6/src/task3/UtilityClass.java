package task3;

import exceptions.MyException;
import exceptions.MyRTException;

public class UtilityClass {
    public static Object getElementByIndex(Object[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static int parseString(String number) {
        try {
            return Integer.valueOf(number);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static void getMyException() throws MyException {
        throw new MyException("Custom Exception");
    }

    public static void getMyRTException() throws MyRTException {
        throw new MyRTException("Custom RTException");
    }

    public static void throwIRExc() throws MyException {
        try {
            throw new IllegalAccessException("illegal");
        } catch (IllegalAccessException e) {
            System.out.println("Illegal Exception");
        } finally {
            throw new MyException("my exception");
        }
    }

    public static double objectToDouble(Object input) {
        try {
            return Double.parseDouble(input.toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

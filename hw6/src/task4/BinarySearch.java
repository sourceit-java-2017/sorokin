package task4;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

public class BinarySearch {
    private int[] arr;

    public BinarySearch(int size) {
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.random() * 100;
        }

        Arrays.sort(arr);
    }

    public int isNumPresent(int start, int end, int num) {
        if(end > start) {
            int mid = (start + end)/2;

            if(arr[mid] == num) {
                return mid;
            }

            if(arr[mid] > num) {
                return isNumPresent(start, mid-1, num);
            } else {
                return isNumPresent(mid + 1, end, num);
            }

        }
        return -1;
    }

    public Boolean contains(int numb) {
        return isNumPresent(0, arr.length - 1, numb) != -1;
    }
}

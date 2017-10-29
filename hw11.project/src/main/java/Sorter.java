import java.util.ArrayList;

public class Sorter {

    public static ArrayList<Integer> BubbleSort(ArrayList<Integer> arr) {
        int s = arr.size();
        int temp;

        for (int i = 0; i < s; i++) {
            for (int j = 1; j < (s - i); j++) {
                if (arr.get(j - 1) > arr.get(j)) {
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }

            }
        }
        return arr;
    }

    public static ArrayList<Integer> InsertSort(ArrayList<Integer> arr) {
        int s = arr.size();
        for (int i = 1; i < s; ++i) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }

        return arr;
    }

    private static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    public static ArrayList<Integer> QuickSort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
        return arr;
    }

    static void merge(ArrayList<Integer> arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr.get(l + i);
        for (int j = 0; j < n2; ++j)
            R[j] = arr.get(m + 1 + j);

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr.set(k, L[i]);
                i++;
            } else {
                arr.set(k, R[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr.set(k, L[i]);
            i++;
            k++;
        }

        while (j < n2) {
            arr.set(k, R[j]);
            j++;
            k++;
        }
    }

    public static ArrayList<Integer> MergeSort(ArrayList<Integer> arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
        return arr;
    }
}

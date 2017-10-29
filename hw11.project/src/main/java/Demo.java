import java.util.ArrayList;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Demo {
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            array.add(i, (int) (Math.random()*10000));
        }

        ArrayList<Integer> arr4bubble = new ArrayList<>(array);
        ArrayList<Integer> arr4insert = new ArrayList<>(array);
        ArrayList<Integer> arr4merge = new ArrayList<>(array);
        ArrayList<Integer> arr4quick = new ArrayList<>(array);

        long startTime = System.currentTimeMillis();
        Sorter.BubbleSort(arr4bubble);
        long endTime   = System.currentTimeMillis();
        logger.info("Demo Bubble sort took, ms: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        Sorter.InsertSort(arr4insert);
        endTime   = System.currentTimeMillis();
        logger.info("Demo Insert sort took, ms: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        Sorter.MergeSort(arr4merge, 0, 5000);
        endTime   = System.currentTimeMillis();
        logger.info("Demo Merge sort took, ms: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        Sorter.QuickSort(arr4quick, 0,5000);
        endTime   = System.currentTimeMillis();
        logger.info("Demo Quick sort took, ms: " + (endTime - startTime));

    }
}

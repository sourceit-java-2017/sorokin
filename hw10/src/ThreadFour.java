public class ThreadFour extends Thread {
    public volatile int maxVal = 0;
    public volatile int indexI = 0;
    public volatile int indexJ = 0;
    public volatile int[][] array = getFilledMatrix();

    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " maxValue: " + getMax(array));
        long endTime   = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " took ms: " + (endTime - startTime));
    }

    private int[][] getFilledMatrix() {
        int[][] arr = new int[100000][4];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                arr[j][i] = (int)(Math.random() * 1000);
            }
        }
        return arr;
    }

    private int getMax(int[][] arr) {
        for (; indexI < arr.length; indexI++) {
            for (; indexJ < arr[indexI].length; indexJ++) {
                if (arr[indexI][indexJ] > maxVal) {
                    maxVal = arr[indexI][indexJ];
                }
            }
        }
        return maxVal;
    }
}

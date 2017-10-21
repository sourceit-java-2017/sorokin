public class ThreadThree extends Thread {
    public void run() {
        long startTime = System.currentTimeMillis();
        int[][] array = FindMax.getFilledMatrix();
        System.out.println(Thread.currentThread().getName() + " maxValue: " + FindMax.getMax(array));
        long endTime   = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " took ms: " + (endTime - startTime));
    }
}

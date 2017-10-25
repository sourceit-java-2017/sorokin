import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTwo extends Thread {

    private static int num = 0;
    public static AtomicInteger  atomicInteger = new AtomicInteger(num);
    public synchronized void run() {
        while (atomicInteger.get() < 21) {
            System.out.println(atomicInteger.getAndIncrement() + " " + Thread.currentThread().getName());
            try {
                this.wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.notifyAll();
        }
    }
}

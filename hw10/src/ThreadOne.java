public class ThreadOne extends Thread {
    public void run() {
        for(int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

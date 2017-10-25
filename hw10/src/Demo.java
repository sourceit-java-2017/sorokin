public class Demo {
    public static void main(String[] args) {
        //Task1
        ThreadOne thread00 = new ThreadOne();
        ThreadOne thread02 = new ThreadOne();

        thread00.setName("Thread-0");
        thread02.setName("Thread-2");

        thread02.start();
        thread00.start();

        //Task2
        ThreadTwo thread10 = new ThreadTwo();
        ThreadTwo thread11 = new ThreadTwo();
        ThreadTwo thread12 = new ThreadTwo();

        thread10.start();
        thread11.start();
        thread12.start();

        //Task3
        ThreadThree thread20 = new ThreadThree();
        thread20.setName("SingleThread");
        thread20.start();

        System.out.println("available procs " + Runtime.getRuntime().availableProcessors());

        ThreadFour thread21 = new ThreadFour();
        ThreadFour thread22 = new ThreadFour();
        ThreadFour thread23 = new ThreadFour();
        ThreadFour thread24 = new ThreadFour();
        thread21.start();
        thread21.setName("Multi-1");
        thread22.start();
        thread22.setName("Multi-2");
        thread23.start();
        thread23.setName("Multi-3");
        thread24.start();
        thread24.setName("Multi-4");
    }
}

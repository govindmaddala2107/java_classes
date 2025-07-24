package MultiThreadingClass;

public class ThreadWay extends Thread {

    int threadNumber;

    public ThreadWay(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number: " + threadNumber + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}

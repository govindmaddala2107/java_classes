package MultiThreadingClass;

public class RunnableWay implements Runnable {

    int threadNumber;

    public RunnableWay(int threadNumber) {
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

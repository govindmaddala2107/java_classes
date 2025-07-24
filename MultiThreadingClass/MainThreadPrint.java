package MultiThreadingClass;

public class MainThreadPrint {
    public static void main(String[] args) {
        // ThreadWay threadWay = new ThreadWay();
        // threadWay.run(); // runs normal

        // ThreadWay threadWay1 = new ThreadWay();
        // ThreadWay threadWay2 = new ThreadWay();

        // threadWay1.start();
        // threadWay2.start();

        for (int i = 0; i < 3; i++) {
            // ThreadWay threadWay = new ThreadWay(i);
            // threadWay.start();

            /*
             * Thread number: 1 0
             * Thread number: 0 0
             * Thread number: 2 0
             * Thread number: 1 1
             * Thread number: 0 1
             * Thread number: 2 1
             * Thread number: 1 2
             * Thread number: 0 2
             * Thread number: 2 2
             * Thread number: 0 3
             * Thread number: 1 3
             * Thread number: 2 3
             * Thread number: 0 4
             * Thread number: 1 4
             * Thread number: 2 4
             */
        }

        // Runnable Implementation
        for (int i = 0; i < 3; i++) {
            RunnableWay runnableWay = new RunnableWay(i);
            Thread thread = new Thread(runnableWay);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
            /*
                Thread number: 0 0
                Thread number: 1 0
                Thread number: 2 0
                Thread number: 0 1
                Thread number: 2 1
                Thread number: 1 1
                Thread number: 0 2
                Thread number: 2 2
                Thread number: 1 2
                Thread number: 0 3
                Thread number: 2 3
                Thread number: 1 3
                Thread number: 2 4
                Thread number: 0 4
                Thread number: 1 4
             */

             /*
             --------WITH JOIN()----------------
                Thread number: 0 0
                Thread number: 0 1
                Thread number: 0 2
                Thread number: 0 3
                Thread number: 0 4
                Thread number: 1 0
                Thread number: 1 1
                Thread number: 1 2
                Thread number: 1 3
                Thread number: 1 4
                Thread number: 2 0
                Thread number: 2 1
                Thread number: 2 2
                Thread number: 2 3
                Thread number: 2 4
              */
        }

    }
}

package AlgoritmaStrukturData;

/**
 *
 * @author user
 */
public class Multithreading2 extends Thread implements Runnable {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Print " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Multithreading2 thread1 = new Multithreading2();
        Multithreading2 thread2 = new Multithreading2();
        thread1.start();
        thread1.start();
    }
}

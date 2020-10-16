package AlgoritmaStrukturData;

/**
 *
 * @author Achmad Dinofaldi Firmansyah
 */
public class Multithreading {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Print " + i);
                        Thread.sleep(3000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread.run();
    }

}

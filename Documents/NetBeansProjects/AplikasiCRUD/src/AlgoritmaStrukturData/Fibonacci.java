
package AlgoritmaStrukturData;

import java.util.Scanner;

/**
 *
 * @author Achmad Dinofaldi Firmansyah
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Input berapa banyak baris fibonacci nya");
        int input = in.nextInt();
        for(int i = 0; i < input; i++){
            int hasil = fibo(i);
            System.out.print( hasil + " ");
        }
    }
    static Integer fibo(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmaStrukturData;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner keyss = new Scanner(System.in);
        n = keyss.nextInt();
        System.out.println("5! = " + faktorial(n) );
        
    }
    static long faktorial(int n){
            if (n == 0){
                return 1;
            }else{
                return n * faktorial(n-1);
            }
        }
}

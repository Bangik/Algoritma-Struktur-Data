package AlgoritmaStrukturData;
import java.util.Scanner;
/**
 *
 * @author Achmad Dinofaldi (E41191882) && Rahadyan Darari Febriyanto (E41192181)
 */
public class KombinasiPermutasi {

    static int nKr(int n, int r) { //Kombinasi
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int nPr(int n, int r) { //Permutasi
        return fact(n) / fact(n - r);
    }

    static int fact(int faktorial) { //rekursif faktorial
        if (faktorial == 0) {
            return 1;
        } else {
            return faktorial * fact(faktorial - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Input nilai dari n : ");
            int n = scan.nextInt();

            System.out.print("Input nilai dari r : ");
            int r = scan.nextInt();

            System.out.println("Hasil Permutasi = " + nPr(n, r));
            System.out.println("Hasil Kombinasi = " + nKr(n, r));
        }catch(StackOverflowError | ArithmeticException e){
            System.out.println("Error");
            System.out.println(e);
        }
    }
}

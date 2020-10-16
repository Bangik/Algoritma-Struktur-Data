package AlgoritmaStrukturData;

/**
 *
 * @author user
 */
public class Permutasi {
    static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    // Returns factorial of n 
    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4, r = 2;
        System.out.println(nPr(n, r));
    }

}

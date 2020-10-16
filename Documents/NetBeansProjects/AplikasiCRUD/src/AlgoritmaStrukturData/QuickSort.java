package AlgoritmaStrukturData;

public class QuickSort {

    static void quickSort(int data[], int a, int b) {
        int a1 = a;
        int b1 = b;
        int pivot = data[(a + b) / 2];
        int temp;
        while (a1 <= b1) {
            while (data[a1] < pivot) {
                a1++;
            }
            while (data[b1] > pivot) {
                b1--;
            }
            if (a1 <= b1) {
                temp = data[a1];
                data[a1] = data[b1];
                data[b1] = temp;
                a1++;
                b1--;
            }
        }
        if (a < b1) {
            quickSort(data, a, b1);
        }
        if (a1 < b) {
            quickSort(data, a1, b);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int dataku[] = {5, 3, 4, 2, 1, 7, 9,11,15,16,23,43,22,21,10,99,98,97,90,102};
        int i;
        int n = dataku.length;
        System.out.println("data belum urut ");
        for (i = 0; i < n; i++) {
            System.out.print(dataku[i] + ",");
        }
        System.out.println("");
        quickSort(dataku, 0, n - 1);
        System.out.println("data yg sudah urut");
        for (i= 0; i < n; i++) {
            System.out.print(dataku[i] + ",");
        }
        
    }

}

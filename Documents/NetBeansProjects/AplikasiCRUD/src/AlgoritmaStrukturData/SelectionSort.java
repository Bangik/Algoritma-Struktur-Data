package AlgoritmaStrukturData;

import java.util.Scanner;

public class SelectionSort {
    static void ascendingsort(int data[]){
        int arr = data.length, i,j,temp;
        for(i = 0; i< arr-1; i++){
            int min = i;
            for(j = i+1; j < arr; j++){
                if (data[j] < data[min]){
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }
    static void descendingsort(int data[]){
        int arr = data.length, i,j,temp;
        for(i = 0; i< arr-1; i++){
            int min = i;
            for(j = i+1; j < arr; j++){
                if (data[j] > data[min]){
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputdata = new Scanner(System.in); //scanner inputan
        int data[] = new int [5]; //inisiasi array
        for(int i = 0; i<data.length; i++){
            data[i] = inputdata.nextInt();
        }
        System.out.println("Sebelum di sorting");
        for(int i = 0; i<data.length; i++){ //cetak array sebelum di sorting
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        ascendingsort(data); //memanggil method
        System.out.println("Sesudah di sorting dengan ascending"); //cetak ascending
        for(int i = 0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        descendingsort(data); //memanggil method
        System.out.println("Sesudah di sorting dengan descending"); //cetak descending
        for(int i = 0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
    
}

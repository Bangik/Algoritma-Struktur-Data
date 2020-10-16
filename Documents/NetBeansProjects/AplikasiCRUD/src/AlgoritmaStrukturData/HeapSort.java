package AlgoritmaStrukturData;

import java.util.Scanner;

public class HeapSort {
    static void ascendingsort(int data[]){ //method heap sort with ascending sort
        int arr = data.length, i, temp; //initialize variabel
        for(i = arr / 2 - 1; i >= 0; i--){ //build heap
            heap(data, arr, i);
        }
        for( i = arr - 1; i>0; i--){ //one by one extract an element from heap
            temp = data[0]; //move current root to end
            data[0] = data[i];
            data[i] = temp;
            
            heap(data, i ,0); //call heap
        }
    }
    static void heap(int data[], int n, int i){ //method heap
        int terbesar = i; //initialize largest as root
        int l = 2*i + 1;
        int r = 2*i + 2;
        
        if(l < n && data[l] > data[terbesar]){
            terbesar = l;
        }
        if(r < n && data[r] > data[terbesar]){
            terbesar = r;
        }
        if (terbesar != i){
            int temp = data[i];
            data[i] = data[terbesar];
            data[terbesar] = temp;
            heap(data, n, terbesar); //recursive
        }
    }
    static void descendingsort(int data[]){ //method heap sort with descending sort
        int arr = data.length, i, temp;
        for(i = arr / 2 - 1; i >= 0; i--){
            heapdes(data, arr, i); //build heap
        }
        for( i = arr - 1; i>0; i--){ //one by one extract an element from heap
            temp = data[0]; // move current root to end
            data[0] = data[i];
            data[i] = temp;
            
            heapdes(data, i ,0); //call method
        }
    }
    static void heapdes(int data[], int arr, int i){ //method heap
        int terkecil = i; //initialize smalles as root
        int l = 2*i + 1; //this is letf
        int r = 2*i + 2; //this is right
        
        if(l < arr && data[l] < data[terkecil]){
            terkecil = l;
        }
        if(r < arr && data[r] < data[terkecil]){
            terkecil = r;
        }
        if (terkecil != i){
            int temp = data[i];
            data[i] = data[terkecil];
            data[terkecil] = temp;
            heapdes(data, arr, terkecil); //recursively heap
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputdata = new Scanner(System.in); //scanner inputan
        System.out.println("Input Angka yang akan di urutkan");
        int data[] = new int [5]; //inisiasi array
        for(int i = 0; i<data.length; i++){
            data[i] = inputdata.nextInt();
        }
        System.out.println("Sebelum di sorting");
        for(int i = 0; i<data.length; i++){ //cetak array sebelum di sorting
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("setelah di sorting ascending");
        ascendingsort(data); //call method ascending       
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("setelah di descending");
        descendingsort(data);//call method descending
        for(int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        
    }
    
}

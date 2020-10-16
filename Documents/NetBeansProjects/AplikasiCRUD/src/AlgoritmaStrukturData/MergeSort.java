package AlgoritmaStrukturData;

import java.util.Scanner;

public class MergeSort {
    static void asmerge(int data[], int l, int m, int r){
        int n1 = m - l + 1; //find size of two sub arrays to be merge
        int n2 = r - m;
        
        int L[] = new int[n1]; //create temp arrays
        int R[] = new int[n2];
        
        for(int i = 0; i<n1; i++){ // copy data to temp arrays
            L[i] = data[l+i];
        }
        for(int j = 0; j<n2; j++){
            R[j] = data[m + 1 + j];
        }
        
        int i = 0, j = 0, k = l; //Initial indexes of first and second subarrays and Initial index of merged subarry array 
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                data[k] = L[i];
                i++;
            }else{
                data[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < n1){ //Copy remaining elements of L[] if any
            data[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){ // Copy remaining elements of R[] if any
            data[k] = R[j];
            j++;
            k++;
        }        
    }
    static void assort(int data[], int l, int r){ //Main function that sorts arr[l..r] using merge()
        if (l < r){
            int m = (l + r) / 2; //find the midle point
            assort(data, l, m); //sort first and second halves
            assort(data, m+1, r);
            asmerge(data, l, m, r); //merge the sorted halves
        }
    }
    static void desmerge(int data[], int l, int m, int r){
        int n1 = m - l + 1; //find size of two sub arrays to be merge
        int n2 = r - m;
        
        int L[] = new int[n1]; //create temp arrays
        int R[] = new int[n2];
        
        for(int i = 0; i<n1; i++){ // copy data to temp arrays
            L[i] = data[l+i];
        }
        for(int j = 0; j<n2; j++){
            R[j] = data[m + 1 + j];
        }
        
        int i = 0, j = 0, k = l; //Initial indexes of first and second subarrays and Initial index of merged subarry array 
        while(i < n1 && j < n2){
            if(L[i] >= R[j]){
                data[k] = L[i];
                i++;
            }else{
                data[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < n1){ //Copy remaining elements of L[] if any
            data[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){ // Copy remaining elements of R[] if any
            data[k] = R[j];
            j++;
            k++;
        }        
    }
    static void dessort(int data[], int l, int r){ //Main function that sorts arr[l..r] using merge()
        if (l < r){
            int m = (l + r) / 2; //find the midle point
            dessort(data, l, m); //sort first and second halves
            dessort(data, m+1, r);
            desmerge(data, l, m, r); //merge the sorted halves
        }
    }
    static void print(int data[]){
        for (int i=0; i<data.length; ++i) {
            System.out.print(data[i] + " "); 
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputan = new Scanner(System.in);        
        int data[] = new int[5];
        System.out.println("Input Angka yang akan di urutkan");
        for(int i = 0; i<data.length; i++){
            data[i] = inputan.nextInt();
        }
        System.out.println("data belum urut");
        print(data);
        System.out.println();
        assort(data, 0, data.length-1);
        System.out.println("data sudah urut dengan ascending");
        print(data);
        System.out.println();       
        dessort(data, 0, data.length-1);
        System.out.println("data sudah urut dengan descending");
        print(data);
        
    }
    
}

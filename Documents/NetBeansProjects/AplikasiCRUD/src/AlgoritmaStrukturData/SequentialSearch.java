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
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    static void sequential(int database[], int data){
        int index = -1;
        for (int i = 0; i < database.length; i++) {
            if(data == database[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Data yang anda cari tidak ada di array");
        }else{
            System.out.println("Anda mencari angka " + data + " yang berada di indeks ke " + index);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int database[] = {1,2,3,4,5,6,23,11,12,7,9};
        int data = 10;
        sequential(database, data);
    }
    
}

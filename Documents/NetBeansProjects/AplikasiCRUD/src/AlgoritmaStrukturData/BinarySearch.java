package AlgoritmaStrukturData;
public class BinarySearch {
    public static void binarySearch(int[] database, int data) {
    int index = -1;
    int lowEnd = 0;
    int highEnd = database.length - 1;
    while (highEnd >= lowEnd) { // Difference of highEnd and lowEnd decreases as the search range narrows
      int middle = (lowEnd + highEnd) / 2;
      // checks if the middle of the lowEnd and the highEnd is the target
      if (database[middle] == data) {
        index = middle; // the target is found
        break;
      } else if (database[middle] < data) {
        // changes the lowEnd to narrow the search range
        lowEnd = middle + 1;
      } else if (database[middle] > data) {
        // changes the highEnd to narrow the search range
        highEnd = middle - 1;
      }
    }
    if (index == -1) {
      System.out.println("Data yang anda cari tidak ada di array");
    } else {
      System.out.println("Anda mencari angka " + data + " yang berada di indeks ke " + index);
    }
  }  
  public static void main(String[] args) {
    // the array has to be sorted before binary search
    int[] database = {1, 11, 24, 34, 67, 89, 102};
    int data = 102;
    binarySearch(database, data);
  }

  
}
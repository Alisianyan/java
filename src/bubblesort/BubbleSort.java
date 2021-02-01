package bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
//         int[] myArray = {45, 77, 88, 2, 16, 9, 1, 10, 78};      
         int[] myArray;
         myArray = new int[]{45, 77, 88, 2, 16, 9, 1, 10, 78};
         sort(myArray);
         for (int i: myArray) {
             System.out.println(i);
         }
         
    }
    
    public static int[] sort(int[] arraySort){
        int i = 1;
        int x = arraySort.length;
        while (x > 1) {
            while (i < arraySort.length) {
                if (arraySort[i] < arraySort[i-1]) {
                    int temp = arraySort[i];
                    arraySort[i] = arraySort[i-1];
                    arraySort[i-1] = temp;
                } 
                i = i+1;
            }
            i = 1;
            x = x -1;
        }
        return arraySort;
    }
}

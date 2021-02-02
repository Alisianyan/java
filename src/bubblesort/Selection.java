package bubblesort;

public class Selection {
    
    public static void main(String[] args) {
       int[] myArray = new int[]{5, 77, 88, 2, 16, 9, 1, 10, 78};
       sort(myArray);
       
       for (int y: myArray){
           System.out.println(y);
       }
    }
    
    public static int min (int pos, int[] arraySort){
        int min = arraySort[pos];
        int min_indx = pos;
        for (int i = pos; i < arraySort.length; i++) {
            if (arraySort[i] < min) {
                min = arraySort[i];
                min_indx = i;
            }
        }
        return min_indx;
    }

    public static int[] sort(int[] arraySort) {
        int x = 1;
        for (int pos=0; pos < arraySort.length; pos++){
            int min_index = min(pos, arraySort);
            int temp = arraySort[pos];
            arraySort[pos] = arraySort[min_index];
            arraySort[min_index] = temp;
        }
        return arraySort;
    }    
}

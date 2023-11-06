import java.time.LocalTime;

public class InsertionSortExample {
    public static void insertionSort(int array[]) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
        int n = array.length;
        for (int num = 0; num < 1000000000; num++) {
            for (int j = 1; j < n; j++) {
                int key = array[j];
                int i = j-1;
                while ( (i > -1) && ( array [i] > key ) ) {
                    array [i+1] = array [i];
                    i--;
                }
                array[i+1] = key;

            }
        }
        LocalTime endTime = LocalTime.now();
        System.out.println("End time: " + endTime);
    }
//MAin function ........
    public static void main(String a[]) {

//        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        int[] arr1 = {58,43,22,14,11,9,3,2};
//        int[] arr1 = {2, 3, 9, 11, 14, 22, 43, 58 };
        System.out.println("Before Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr1);//sorting array using insertion sort

        System.out.println("After Insertion Sort");
        for (int i : arr1) {
            System.out.print(i + " ");

        }System.out.println();

        System.out.println("The difference for avg case is "+ "8s");
        System.out.println("The difference for worst case is "+ "9s");
        System.out.println("The difference for best case is "+ "4s");
        System.out.println("loop ran 1000000000 times");


    }}
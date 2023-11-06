import java.time.LocalTime;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] array = {9, 14, 3, 2, 43, 11, 58, 22};
        int[] array = {2, 3, 9, 11, 14, 22, 43, 58};
        bubbleSort(array);
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("19s - avg case");
        System.out.println("24s - worst case");
    }

    public static void bubbleSort(int[] arr) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);
        int n = arr.length;
        for (int num = 0; num < 1000000000; num++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

        }
        LocalTime endTime = LocalTime.now();
        System.out.println("End time: " + endTime);
    }
}


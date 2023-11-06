import java.util.Arrays;
import java.util.Random;

public class CompareQuickAndMerge {
    public static void main(String[] args) {
        int[] arrQuickSort, arrMergeSort;
        long startTime, endTime;

        // Generate a random array for testing
        int n = 100000;
        Random random = new Random();
        arrQuickSort = new int[n];
        arrMergeSort = new int[n];
        for (int i = 0; i < n; i++) {
            int num = random.nextInt(1000000);
            arrQuickSort[i] = num;
            arrMergeSort[i] = num;
        }

        // Measure Quick Sort time
        startTime = System.nanoTime();
        quickSort(arrQuickSort, 0, n - 1);
        endTime = System.nanoTime();
        float quickSortTime = endTime - startTime;

        // Reset the array
        for (int i = 0; i < n; i++) {
            arrQuickSort[i] = arrMergeSort[i];
        }

        // Measure Merge Sort time
        startTime = System.nanoTime();
        mergeSort(arrMergeSort);
        endTime = System.nanoTime();
        float mergeSortTime = endTime - startTime;

        // Print the time complexity comparison
        System.out.println("Quick Sort Time: " + quickSortTime + " nanoseconds");
        System.out.println("Merge Sort Time: " + mergeSortTime + " nanoseconds");



        System.out.println("time taken for quick sort = "+ quickSortTime/ 1000000000     +" seconds.");
        System.out.println("time taken for Merge sort = "+ mergeSortTime/ 1000000000     +" seconds.");
    }

    // Quick Sort Algorithm
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Merge Sort Algorithm
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }

        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}

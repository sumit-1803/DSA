public class BinarySearchComplexity {
    // Binary Search using Recursion
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Element not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Element found at index mid
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search in the right half
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1); // Search in the left half
        }
    }

    // Binary Search using Iteration
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Element found at index mid
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        // Measure and print execution time for Binary Search using Recursion
        long startTimeRecursive = System.nanoTime();
        int resultRecursive = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        long endTimeRecursive = System.nanoTime();
        double executionTimeRecursiveInSeconds = (endTimeRecursive - startTimeRecursive) / 1e9;

        if (resultRecursive != -1) {
            System.out.println("Element found at index (Recursive): " + resultRecursive);
        } else {
            System.out.println("Element not found in the array (Recursive).");
        }
        System.out.println("Execution Time (Recursive): " + executionTimeRecursiveInSeconds + " seconds");

        // Measure and print execution time for Binary Search using Iteration
        long startTimeIterative = System.nanoTime();
        int resultIterative = binarySearchIterative(sortedArray, target);
        long endTimeIterative = System.nanoTime();
        double executionTimeIterativeInSeconds = (endTimeIterative - startTimeIterative) / 1e9;

        if (resultIterative != -1) {
            System.out.println("Element found at index (Iterative): " + resultIterative);
        } else {
            System.out.println("Element not found in the array (Iterative).");
        }
        System.out.println("Execution Time (Iterative): " + executionTimeIterativeInSeconds + " seconds");
    }
}

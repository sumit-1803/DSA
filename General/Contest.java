public class Contest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 5;
        int one = -1; // Initialize to -1 to indicate no valid indices found
        int two = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start j from i+1 to avoid using the same element twice
                if (nums[i] + nums[j] == target) {
                    one = i;
                    two = j;
                    break; // You can exit the loop once a valid pair is found
                }
            }
            if (one != -1) {
                break; // Exit the outer loop once a valid pair is found
            }
        }

        
    }
}

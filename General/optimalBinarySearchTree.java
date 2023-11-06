public class optimalBinarySearchTree{
    public static int BinarySearchOptimal(int arr[], int first, int last, int target){
        while (first < last){
            int mid = first + (last - first) / 2;
            if (arr[mid] > target){
                last = mid;
            }
            else{
                first = mid;
            }
        }
        if(arr[first] == target){
            return first;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args){
        int nums[] = {0, 2, 5, 7, 9, 13, 18, 20, 25, 32};
        int result = BinarySearchOptimal(nums, 0, nums.length - 1, 9);
        System.out.println(result);
}
}
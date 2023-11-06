import java.util.Arrays;

public class selfMadeCyclicSort {
    public static void main(String[] args) {
        int[] nums= {5,4,3,2,1};
        System.out.print("Before sort : ");
        System.out.println(Arrays.toString(nums));
        System.out.print("After sort : ");
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void cyclicSort(int[] nums){
        int i =0;
        while(i<nums.length){
            int correct = (nums[i]-1)%nums.length;
            if (nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
    }

    public static void swap(int[] arr , int firstindx , int secondindx){
        int temp = arr[firstindx];
        arr[firstindx]=arr[secondindx];
        arr[secondindx]=temp;
    }
}

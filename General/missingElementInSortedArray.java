//Solution is for o(n) complexity but we have to find a way to do it in o(logn)


public class missingElementInSortedArray {
    public static void main(String[] args) {
        int[] nums={1,1,4,4,6,6,7,8,8};
        int ans= singleNonDuplicate(nums);
        System.out.println(ans);
    }

    static int binarySearch(int[] nums, int target , int start , int end ){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    static public int singleNonDuplicate(int[] nums) {
        int i =0 ;
        while(i<nums.length){
            int pivot= nums[i];
            int index=binarySearch(nums,nums[i],i+1,nums.length-1);
            if (index==-1){
                return pivot;
            }
            int copy=nums[index];
            System.out.println("Copy when i= "+i+ " = "+ copy);


            if(copy==pivot){
                i+=2;
            }
            else{
                return pivot;
            }
        }
        return nums.length;
    }
}






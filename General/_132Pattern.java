public class _132Pattern {
    public static void main(String[] args) {
        int[] nums={3,5,0,3,4};
        System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
        for(int i=0; i<nums.length-2;i++){
            int num1 = nums[i];
            int num2=nums[i+1];
            int num3=nums[i+2];

            if(num1 < num2 && num2> num3 && num1<num3){
                return true;
            }
        }
        return false;
    }
}

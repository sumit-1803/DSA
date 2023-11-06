public class findEven {
    public static void main(String[] args) {
        int[] nums = {12,34,56,7,332,13467};
        System.out.println(findNumbers(nums));
    }
        static int count(int num){
            int count =0;
            while(num>0){
                count++;
                num=num/10;
            }
            return count;
        }

        static int findNumbers(int[] nums) {
            int count =0;
            for ( int num : nums){
                int div = count(num);
                if( div%2 == 0){
                    count++;
                }

            }
            return count;
        }

    }



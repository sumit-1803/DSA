import java.util.Arrays;
import java.util.*;

//public class largestNumberPossible {
//    public static void main(String[] args) {
//        int[] nums = {4,29};
//        System.out.println(largestNumber(nums));;
//    }
//
//    public static  String largestNumber(int[] nums) {
//        int n = nums.length;
//        String[] s = new String[n];
//        for (int i = 0; i < n; i++) {
//            s[i] = String.valueOf(nums[i]);
//        }
//
//        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));
//        StringBuilder sb = new StringBuilder();
//        for(String str : s)
//            sb.append(str);
//
//        String result = sb.toString();
//        return result.startsWith("0") ? "0" :result;
//
//    }
//}

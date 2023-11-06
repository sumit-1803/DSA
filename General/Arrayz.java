import java.util.ArrayList;
import java.util.Arrays;

public class Arrayz {
    public static void main(String[] args) {
        int[] nums = {22,589,559,58,247};

        int[] nums2 = new int[nums.length+1] ;
//        System.out.println(nums2.length);
        for ( int i = 0; i<nums.length; i++ ){
            nums2[i]=nums[i];

        }
//        System.out.println(java.util.Arrays.toString(nums2));

        ArrayList i = new ArrayList();

        i.add(2);

        for (int j = 0; j < i.toArray().length; j++) {
            System.out.println(i.get(j));
        }
        int[] banana = {54};

        System.out.println(Arrays.toString(banana));

        for (int j = 0; j < i.toArray().length; j++) {
            banana[j] = (int) i.get(j);
        }
        System.out.println(Arrays.toString(banana));




//        for (int i = 0; i < nums.length; i++) {
//            System.out.println("The object at index " + i + " is "+ nums[i]);
//        }

//        String[] words = new String[5];
//        for (int i = 0; i < words.length; i++) {
//            System.out.println("The object at index " + i + " is "+ words[i]);
//        }


//        For Each loop
//        for (String w : words){
//            System.out.println(w+" ");
//        }


//        Arrays.toString Method

//        System.out.println(java.util.Arrays.toString(words));

        
        

        
    }
}

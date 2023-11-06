import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr={7,6,5,4,3,2,1};
        arr= mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
//        Base Condition
        if (arr.length ==1){
            return arr;
        }
//        Finding Mid to Start Dividing
        int mid = arr.length/2;

//        Starts To Divide array into sub-arrays
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length)) ;

//        Custom Function to merge the returned sub-arrays
        return merge(left,right);
    }

//      Implementation of the custom Function "Merge"
    private static int[] merge(int[] first, int[] second) {
//        Making new array to store the resultant sub-arrays's sum
//        Has a length of first sub array + second sub array
        int[] mix = new int[first.length + second.length];


//        Three pointers to keep track of sub array index being inspected
        int i=0;
        int j=0;
        int k=0;


//      Checking which sub arrays element is smaller is size and adding in mix sub-array
        while (i<first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

//        may be possible that one of the arrays is not complete
//        copy the remaining elements
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            i++;
            k++;
        }
        return mix;
    }
}

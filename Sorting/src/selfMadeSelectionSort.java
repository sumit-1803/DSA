import java.util.Arrays;
public class selfMadeSelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,6,2,8,7,9,1,6,3,5,4};
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] n){
        for (int i = 0; i < n.length; i++){
            int last= n.length-1-i;
            int maxIndex= getMaxIndex(n,0,last);

            swap(n,maxIndex,last);
        }
    }

    private static void swap(int[] arr ,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[]arr ,int start , int end){
        int max = start;
        for (int i = start; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}

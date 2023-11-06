import java.util.Arrays;
public class selfMadeInsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }
        }
    }

    public static void swap(int[] arr, int firstpos , int secondpos ){
        int temp=arr[firstpos];
        arr[firstpos]=arr[secondpos];
        arr[secondpos]=temp;
    }
}

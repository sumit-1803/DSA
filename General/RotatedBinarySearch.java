public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(RotatedBinarySearch(arr,6,0,arr.length-1));

    }

    static int RotatedBinarySearch(int[] arr , int target , int s , int e){
        if (s>e){
            return -1;
        }
        int  m = s + (e-s)/2;
        if(arr[m]==target){
            return m;
        }

        if (arr[s]<= arr[m]){
            if (target >= arr[s] && target <= arr[m]){
                return RotatedBinarySearch(arr,target , s , m-1);
            } else {
                return RotatedBinarySearch(arr,target,m+1,e);
            }
        }

        if (target>= arr[m] && target <= arr[e]){
            return RotatedBinarySearch(arr,target,m+1,e);
        }
        return RotatedBinarySearch(arr,target , s , m-1);
    }
}

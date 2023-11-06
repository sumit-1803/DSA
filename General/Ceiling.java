public class Ceiling {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int target=1;
        System.out.println(BinarySearch(array,target));
        int n = Integer.MIN_VALUE;
    }

    static int BinarySearch(int[] n , int target){
        int start = 0;
        int end = n.length-1;


        while(start<=end){
            int mid = (start+end)/2;
            if (target==n[mid]){
                return mid;
            }
            else if (target<n[mid]) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return -1;
    }
}

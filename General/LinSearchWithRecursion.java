public class LinSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {32,345,546,45,6783,672,456,345,6245,7,658,456,245,6724,7346,7,3567,356,835,67,367,26,7356,8};
        int number = 245;
        System.out.println("Searching for number: " + number);
        System.out.println("Is The element present? ==>  " + LinSearchRecursion(arr,number,0));
        System.out.println("Element present at index ==>  " + LinSearchRecursionWithIndex(arr,number,0));
    }

    static boolean LinSearchRecursion(int[] arr ,int target ,  int index ){
        if(index == arr.length){
            return false;
        }
        return  arr[index] == target || LinSearchRecursion(arr, target , index+1);
    }

    static int LinSearchRecursionWithIndex(int[] arr ,int target ,  int index ){
        if(index == arr.length){
            return -1;
        }
//        return  arr[index] == target || LinSearchRecursion(arr, target , index+1);
        if (arr[index]==target){
            return index;
        }
        else{
            return LinSearchRecursionWithIndex(arr,target ,index+1);
        }
    }
}

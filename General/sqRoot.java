public class sqRoot {
    public static void main(String[] args) {
        int x= 651651685;
        System.out.println(mySqrt(x));;
    }
    public static int mySqrt(int x) {
        long start=0;
        long end=x;
        int ans=-1;

        while(start<=end){
            long mid = start+(end-start)/2;
            long sq =mid*mid;

            if(x==sq){
                return (int) mid;
            }
            else if(sq<x){
                ans = (int) mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int) ans;
    }

}
public class recursionLearning {
    public static void main(String[] args) {
        fun(5);
        funBoth(10);
    }
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }static void funBoth(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
}

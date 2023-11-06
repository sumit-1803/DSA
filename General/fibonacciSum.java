import java.util.ArrayList;

public class fibonacciSum {
    public static void main(String[] args) {
        System.out.println(fibonacciSum(3));
    }
    public static int fibonacciSum(int n){
        int num1=0;
        int num2=1;
        int sum=0;
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(num1);
        fib.add(num2);

        for (int i=2; i<=n;i++){
            int temp= num2;
            num2=num1+num2;
            num1=temp;
        }

        return  sum;
    }
}

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse it ");
        int num = sc.nextInt();
        String n = Integer.toString(num);
        int len = n.length();


        String temp = "";
        for (int i = len-1 ; i >=0 ; i--) {

            temp += n.charAt(i);

        }
        System.out.println("The reversed number is ------->  " + temp);
    }
}

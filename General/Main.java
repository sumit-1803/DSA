import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       String my = sc.next();
       char myChar = my.charAt(0);
       if (myChar >= 'a' && myChar<='z'){
           System.out.println("LowerCase");
       }else {
           System.out.println("UpperCase");
       }
       int a =8;
       int b =20;
        System.out.println(a|b);


}}
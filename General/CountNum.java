public class CountNum {
    public static void main(String[] args) {
        int count = 0 ;
        int num = 1234555;
        while ( num > 0){
           int rem = num %10;
           if (rem == 5){
               count++;
           }else {
               System.out.println("Nothing");
           }
            num=num/10;
        }

        System.out.println("The count is : "+ count);
    }
}

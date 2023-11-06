public class ReverseNumbers {
    public static void main(String[] args) {
        int n = 35498;
        String out = "";
        while (n>0){
            int digit = n%10;
            String digit1 = Integer.toString(digit);
//            System.out.println("Digit is " + digit);


            out = out + (digit1);

            n/=10;


        }
        System.out.println("The reversed "+out);
    }
}

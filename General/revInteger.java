public class revInteger {
    public static void main(String[] args) {
        int int1=1234567;
        System.out.println("hello?");
        int newnum= 0;
        System.out.println("Newnum initially "+ newnum);
        while(int1>0){
            int digit = int1%10;
            newnum= newnum*10 + digit;
            int1=int1/10;
        }
        System.out.println("New newnum  : "+newnum);
    }
}

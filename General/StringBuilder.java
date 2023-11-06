import java.util.ArrayList;

public class StringBuilder {
    public static void main(String[] args) {
//        This is known as pretty printing and %.2f is used to show number upto 2 decimal places and also round it .
        System.out.printf("The value of pi is %.5f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and my surname is %s","Summit","Kumar");
        System.out.println();

        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+10);
        System.out.println('a'+"b");
        System.out.println((char)('a'+2));
        System.out.println("sumit"+ new ArrayList<>());  // if there is an object it will call the tostring method

//        but alteast one thing must be of type string
//        System.out.println(new Integer(332) + new ArrayList<>());     //ERROR
        String ans=new Integer(332) +""+ new ArrayList<>();
        System.out.println(ans); //This Works

    }
}

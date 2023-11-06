import java.lang.StringBuilder;
import java.util.Arrays;

public class StringB {
    public static void main(String[] args) {

//        Only makes changes to the  same object and never creates new objects leaving behind old objects with no refrence variable .

//        Mutable unlike Strings .
        StringBuilder builder = new StringBuilder();
        String name = "Sumit";

        int num =32;

        for (int i = 0; i < 26; i++) {
            char ch= (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.indexOf(""));
        System.out.println(Arrays.toString(name.toCharArray()));  // Way to create char array from String
        System.out.println(builder);

        char[] hello = name.toCharArray();
        System.out.println(Arrays.toString(hello));
    }
}

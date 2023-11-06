import java.util.Arrays;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s ="Hello Friend my name is Sum";
        System.out.println(lengthOfWord(s));
    }
    static int lengthOfWord(String s){
        String[] w = s.split(" ");
        int n = w.length-1;
        String word = w[n];



        return word.length();
    }
}

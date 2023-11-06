public class revString {
    public static void main(String[] args) {
        String s= "The sky is blue";
//        System.out.println(reverseWords(s));

    }
    public static String reverseWords(String s) {
        String ss = s.trim();
        String[] s1 = ss.split(" ");
        String result = "";
        for (int i = s1.length-1; i >=0; i--) {
            result = result + s1[i]+" ";
        }
        return result;
    }
}

public class validPalindrome {
    public static void main(String[] args) {
        String test1= "racecar";
        String test2= "A man, a plan, a canal: Panama";
        String test3= "race a car";

        System.out.println(isValidPalindrome(test1));
    }

    public static boolean isValidPalindrome(String s){
        String copy = "";

        for (int i = -1; i<= -(s.length()); i++) {
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                copy += ch;
            }
            System.out.println("The copy word is " + copy);
        }








        return false;
    }

}

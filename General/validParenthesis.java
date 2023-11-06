public class validParenthesis {
    public static void main(String[] args) {
        String s = "[]()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = start + 1;


        while (end <= s.length() - 1) {
            char leftChar = s.charAt(start);
            char rightChar = s.charAt(end);
            if ((leftChar == '(' && rightChar == ')') ||
                    (leftChar == '[' && rightChar == ']') ||
                    (leftChar == '{' && rightChar == '}')) {
                start += 2;
                end += 2;
            } else {
                return false; // If it's not a valid pair, the string is invalid
            }
        }
        return start == s.length();
    }
}

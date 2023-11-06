    import java.util.ArrayList;

    public class longestSubstringWithoutRepeat {
        public static void main(String[] args) {
            String s= "abcabab";
            lengthOfLongestSubstring(s);

//          it is not debugged yet 
        }

            static int lengthOfLongestSubstring(String s) {
                int count = 1;
                if (s.isEmpty()) {
                    return 0;
                }
                char[] alpha = s.toCharArray();
                ArrayList<Integer> nums = new ArrayList<>();

                for (int i = 0; i < alpha.length; i++) {
                    if (i < alpha.length - 1 && alpha[i] != alpha[i + 1]) {
                        count++;
                    } else {
                        nums.add(count);
                        count = 1;
                    }
                }

                int highest = nums.get(0);
                for (int i = 1; i < nums.size(); i++) {
                    if (nums.get(i) > highest) {
                        highest = nums.get(i);
                    }
                }

                return highest;
            }
    }

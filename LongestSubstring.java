import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> charSet = new HashSet<>();

        while (end < n) {
            if (!charSet.contains(s.charAt(end))) {
                charSet.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                charSet.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "abcabcbb"; // You can change this to your input string
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}

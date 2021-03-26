//Given an integer x, return true if x is palindrome integer. 
//
// An integer is a palindrome when it reads the same backward as forward. For ex
//ample, 121 is palindrome while 123 is not. 
//
// 
// Example 1: 
//
// 
//Input: x = 121
//Output: true
// 
//
// Example 2: 
//
// 
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes
// 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// Example 4: 
//
// 
//Input: x = -101
//Output: false
// 
//
// 
// Constraints: 
//
// 
// -231 <= x <= 231 - 1 
// 
//
// 
//Follow up: Could you solve it without converting the integer to a string? Rela
//ted Topics Math 
// 👍 3155 👎 1714


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public static void main(String[] args) {
        boolean palindrome = new Solution().isPalindrome(1221);
        System.out.println(palindrome);
    }
//    public boolean isPalindrome(int x) {
//        String s = new StringBuilder().append(Math.abs(x)).reverse().toString();
//        try {
//            return String.valueOf(x).equals(s);
//        } catch (Exception e) {
//            return false;
//        }
//    }

//    public boolean isPalindrome(int x) {
//        if (x == 0) return true;
//        if (x < 0 || x % 10 == 0) return false;
//        int source = new Integer(x);
//        int ref = 0;
//        while (x > 0) {
//            int right = x % 10;
//            x /= 10;
//            if (x > Integer.MAX_VALUE / 10 || (x == Integer.MAX_VALUE && right > 7)) return false;
//            if (x < Integer.MIN_VALUE / 10 || (x == Integer.MIN_VALUE && right < -8)) return false;
//            ref = ref * 10 + right;
//        }
//        return ref == source;
//    }

    // good!!
    public boolean isPalindrome(int x) {
        try {
            if (x == 0) return true;
            if (x < 0 || x % 10 == 0) return false;
            int ref = 0;
            while (x > ref) {
                ref = ref * 10 + x % 10;
                x /= 10;
            }
            return x == ref || x == ref/10;
        } catch (Exception e) {
            return false;
        }
    }

    // not good
//    @Deprecated
//    public boolean isPalindrome(int x) {
//        if (x == 0) return true;
//        if (x < 0 || x % 10 == 0) return false;
//        char[] chars = String.valueOf(x).toCharArray();
//        int length = chars.length;
//        int divide = length / 2;
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < divide; i++) {
//            sb.append(chars[i]);
//        }
//        StringBuilder sb2 = new StringBuilder();
//        for (int i = length - 1; i >= length - divide; i--) {
//            sb2.append(chars[i]);
//        }
//        System.out.println(sb);
//        System.out.println(sb2);
//        return sb.toString().equals(sb2.toString());
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

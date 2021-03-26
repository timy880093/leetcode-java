//Given a signed 32-bit integer x, return x with its digits reversed. If reversi
//ng x causes the value to go outside the signed 32-bit integer range [-231, 231 -
// 1], then return 0. 
//
// Assume the environment does not allow you to store 64-bit integers (signed or
// unsigned). 
//
// 
// Example 1: 
// Input: x = 123
//Output: 321
// Example 2: 
// Input: x = -123
//Output: -321
// Example 3: 
// Input: x = 120
//Output: 21
// Example 4: 
// Input: x = 0
//Output: 0
// 
// 
// Constraints: 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics Math 
// 👍 4492 👎 6884


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * this problem like shit , assume you doesn't allow 64-bit over 2^32 = 2147483648 ,
 * but system use 9646324351 to test your code , it is over 2^32 !!
 * then throw RuntimeException
 */
class ReverseInteger {
//class Solution {

//        public static void main(String[] args) {
//        int reverse = new Solution().reverse(96463243545);
//        System.out.println(reverse);
//        int i1 = 2 ^ 32;
//    }
//    public int reverse(int x) {
//        if (-Math.pow(2, 31) > x || x > Math.pow(2, 31) - 1)
//            return 0;
//        final char[] chars = String.valueOf(Math.abs(x)).toCharArray();
//        final StringBuilder sb = new StringBuilder();
//        for (int i = chars.length - 1; i >= 0; i--) {
//            sb.append(chars[i]);
//        }
//        int y = Integer.parseInt(sb.toString());
//        return x >= 0 ? y : -y;
//    }

    public int reverse(int x) {
        String s = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return x < 0 ? Integer.parseInt(s) * -1 : Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }


//    public int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
//    }

}
//leetcode submit region end(Prohibit modification and deletion)

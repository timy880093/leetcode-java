import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly once.
 * <p>
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * <p>
 * 1 <= s.length, t.length <= 5 * 10⁴
 * s and t consist of lowercase English letters.
 * <p>
 * <p>
 * <p>
 * Follow up: What if the inputs contain Unicode characters? How would you adapt
 * your solution to such a case?
 * <p>
 * Related Topics Hash Table String Sorting 👍 7558 👎 250
 */

public class _242_ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new _242_ValidAnagram().new Solution();
//        solution.isAnagram("rat", "car");
        solution.isAnagram("anagram", "nagaram");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /*
        only a-z (code 97-122), so new int[26]
        first for loop key subtract 97, then sValue+1 、 tValue-1
        second for loop find not equals 0 in counts
         */
        public boolean isAnagram(String s, String t) {
            int length = s.length();
            if (length != t.length()) return false;
            int[] counts = new int[26];
            for (int i = 0; i < length; i++) {
                int sKey = s.codePointAt(i) - 97;
                int tKey = t.codePointAt(i) - 97;
                if (sKey == tKey) continue;
                counts[sKey]++;
                counts[tKey]--;
            }
            for (int count : counts) {
                if (count != 0) return false;
            }
            return true;

        }

        public boolean isAnagram2(String s, String t) {
            int length = s.length();
            if (length != t.length()) return false;
            Map<Integer, Integer> sMap = new HashMap<>();
            Map<Integer, Integer> tMap = new HashMap<>();
            for (int i = 0; i < length; i++) {
                int sKey = s.codePointAt(i);
                int sValue = sMap.getOrDefault(sKey, 0);
                sMap.put(sKey, sValue + 1);

                int tKey = t.codePointAt(i);
                int tValue = tMap.getOrDefault(tKey, 0);
                tMap.put(tKey, tValue + 1);
            }
            return sMap.equals(tMap);
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
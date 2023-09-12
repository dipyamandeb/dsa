/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> numberContent = new HashMap<>();
        numberContent.put('I', 1);
        numberContent.put('V', 5);
        numberContent.put('X', 10);
        numberContent.put('L', 50);
        numberContent.put('C', 100);
        numberContent.put('D', 500);
        numberContent.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && numberContent.get(s.charAt(i)) < numberContent.get(s.charAt(i + 1))) {
                sum-= numberContent.get(s.charAt(i));
            } else {
                sum+= numberContent.get(s.charAt(i));
            }
        }
        return sum;
    }
}
// @lc code=end

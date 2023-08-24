/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                hs.remove(nums[i]);
            } else {
                hs.add(nums[i]);
            }
        }
        return hs.iterator().next();
    }
}
// @lc code=end

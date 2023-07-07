/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int keyIndex = hm.get(nums[i]);
                if (k >= Math.abs(i - keyIndex)) {
                    return true;
                }
                hm.put(nums[i], i);
            }
            hm.put(nums[i], i);
        }
        return false;
    }
}
// @lc code=end

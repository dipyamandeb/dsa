/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
//target will stay at left or right sorted parted.
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <=r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            // left part is sorted
            if (nums[l] <= nums[mid]) {
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            } else {
                // rt part sorted
                if (target < nums[mid] || target > nums[r]) {
                    // l = mid+1;
                    r = mid - 1;

                } else {
                    l = mid + 1;
                }
            }

        }
        return -1;
    }
}
// @lc code=end

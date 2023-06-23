/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum = 0;
        int rightSum = 0;
        int total = 0;
        int j=0;
        while (j < nums.length) {
            total += nums[j];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            rightSum = total-nums[i]-leftSum;
            if(leftSum==rightSum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}
// @lc code=end

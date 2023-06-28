/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
         for(int r= 0 ;r<nums.length;r++){
            if(nums[r]!=0){
                //swap
                int temp = nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                l++;
            }
         }
    }
}
// @lc code=end


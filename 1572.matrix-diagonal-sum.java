/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        for(int i=0;i<mat.length;i++){
            //primary diagonal
            res+=mat[i][i];
            //seconday diagonal
            res+= mat[i][mat.length-i-1];
        }
        //odd matrix, substract the common middle diagonal element    
        if(mat.length%2!=0){
            res-=mat[mat.length/2][mat.length/2];
        }

        return res;
    }
}
// @lc code=end


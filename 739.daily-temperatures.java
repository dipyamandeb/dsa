/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start

import java.util.Arrays;
import java.util.Stack;
import javafx.util.Pair;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[] = new int[temperatures.length];
        Arrays.fill(res,0);
        // Pair p = new Pair<Integer,Integer>(null, null);
        Stack<Pair<Integer, Integer>> stack = new Stack<Pair<Integer,Integer>>();
        // Pair p = stack.peek();
        // p.

        for(int i = 0;i<temperatures.length;i++){
                while(!stack.isEmpty() 
                && temperatures[i]>stack.peek().getKey()){
                    Pair<Integer,Integer> p = stack.pop();
                    Integer tmpr = p.getKey();
                    Integer stackIndex = p.getValue();
                    res[stackIndex] = i- stackIndex;
                }
                stack.push(new Pair<Integer,Integer>(temperatures[i], i));
        }
        return res;
    }
}
// @lc code=end


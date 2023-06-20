/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character, Character> map2 =new HashMap<>();
         int i = 0;

         while(i<s.length()){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            if((map1.containsKey(c1) && map1.get(c1)!=c2)||
            (map2.containsKey(c2) && map2.get(c2)!=c1))
            {
                return false;
            }
            map1.put(c1, c2);
            map2.put(c2, c1);
            i++;
         }
        

        return true;
    }
}
// @lc code=end


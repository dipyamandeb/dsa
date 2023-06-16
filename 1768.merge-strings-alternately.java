/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuffer res = new StringBuffer();

        while (i < word1.length() && i < word2.length()) {
            res.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        if (i < word1.length())
            while (i != word1.length()) {
                res.append(word1.charAt(i));
                i++;
            }
        if (i < word2.length())
            while (i != word2.length()) {
                res.append(word2.charAt(i));
                i++;
            }

        return res.toString();
    }
}
// @lc code=end

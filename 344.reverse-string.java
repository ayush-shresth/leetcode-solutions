/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int len= s.length;
        int low=0;
        int high=len-1;
        char temp;
        // if(len%2!=0)
        
            for (int i = 0; i < len; i+=2) {
                temp=s[low];
                s[low]=s[high];
                s[high]=temp;
                low++;
                high--;
            }

        
        
    }
}
// @lc code=end


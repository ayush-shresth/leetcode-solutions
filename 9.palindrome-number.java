import jdk.vm.ci.aarch64.AArch64.Flag;

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int a=x;
        int r=0;
        while(x>0)
        {
            r=r*10+x%10;
            x/=10;
        }
        if (a==r) {
            return true;
            
        } else {
            return false;
        }

        

        

        
    }
}
// @lc code=end


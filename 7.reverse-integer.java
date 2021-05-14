import javax.swing.event.DocumentEvent.ElementChange;

/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverre Integer
 */

// @lc code=rtart
class Solution {
    public int reverse(int x) {

        if (x > Integer.MAX_VALUE)
            return 0;

        boolean neg = false;
        if (x < 0) {
            x *= -1;
            neg = true;
        }
        long r = 0;
        while (x != 0) {
            r = r * 10 + x % 10;
            x /= 10;

        }
        if (neg) {
            r = r * -1;
        }
        if(r >= Integer.MIN_VALUE && r <= Integer.MAX_VALUE)
			return (int)r;
		else
			return 0;

    }
}
// @lc code=end

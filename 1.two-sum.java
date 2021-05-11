/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        // int a = 0;

        int n = nums.length;
        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }
        return result;

    }
}
// @lc code=end

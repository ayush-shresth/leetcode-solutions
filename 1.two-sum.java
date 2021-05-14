/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     int result[] = new int[2];
    //     // int a = 0;

    //     int n = nums.length;
    //     for (int i = 0; i < n; i++) {

    //         for (int j = i+1; j < n; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 result[0] = i;
    //                 result[1] = j;

    //                 return result;
    //             }
    //         }
    //     }
    //     return result;

    // }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}
// @lc code=end

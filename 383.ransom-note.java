/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr1[magazine.charAt(i)-'a']++;
        } 
        for (int i = 0; i < ransomNote.length(); i++) {
            arr2[ransomNote.charAt(i)-'a']++;
        } 
        for (int i = 0; i < 26; i++) {
            if(arr1[i]<arr2[i])
            return false;
        }
        return true;
            
        
    }
}
// @lc code=end


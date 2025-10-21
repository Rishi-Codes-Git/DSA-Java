// Date: 11/10/25
// Problem: https://leetcode.com/problems/concatenation-of-array
// Approach: Create new array of 2n and add each element using two pointer.
// Time: O(n)
// Space: O(1)

package arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[n+i]=nums[i];
        }
        return ans;
    }
}
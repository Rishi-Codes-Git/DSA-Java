// Problem: https://leetcode.com/problems/running-sum-of-1d-array
// Approach: increment a sum and add to array indexes.
// Time: O(n)
// Space: O(1)

package arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}
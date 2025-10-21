// Date: 13/10/25
// Problem: https://leetcode.com/problems/majority-element
// Approach: iterate through each element and count votes.
// Time: O(n)
// Space: O(1)

package arrays;

class Solution {
    public int majorityElement(int[] nums) {
        int majority =nums[0],votes=1;
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }
            else if(majority==nums[i]){
                votes++;
            }
            else{
                votes--;
            }
        }
        return majority;
    }
}

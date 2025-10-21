// 🔗 Problem: https://leetcode.com/problems/move-zeroes
// 💡 Approach: use single pointer 
// ⏱️ Time: O(n)
// 💾 Space: O(1)

package arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        while(count<nums.length){
            nums[count]=0;
            count++;
        }
    }
}

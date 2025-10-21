
// 🔗 Problem: https://leetcode.com/problems/build-array-from-permutation
// 💡 Approach: Use bruteforce iterating each and every element in array
// ⏱️ Time: O(n)
// 💾 Space: O(1)


package arrays;

class solution {
    public int[] builddArray(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}
// Date: 13/10/25
// Problem: https://leetcode.com/problems/shuffle-the-array
// Approach: add i,i+1 into arraylist one by one and convert to array.
// Time: O(n)
// Space: O(n)

package arrays;
import java.util.ArrayList;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> arr= new ArrayList<>();
        int[] array = new int[2*n];
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
            arr.add(nums[i+n]);
        }
        for(int j=0;j<(2*n);j++){
            array[j]=arr.get(j);
        }
        return array;
    }
}
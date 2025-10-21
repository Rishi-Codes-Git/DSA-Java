// Problem: https://leetcode.com/problems/richest-customer-wealth
// Approach: add wealth of each customer into 1d array and find maximum of it.
// Time: O(m x n)
// Space: O(m)

package arrays;

public class 1672. richCustomer {
    class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int count = 0;
            for(int j=0;j<accounts[i].length;j++){
                count+=accounts[i][j];
            }
            wealth[i]=count;
        }
        int max =wealth[0];
        for(int k=1;k<wealth.length;k++){
            if(wealth[k]>max){
                max=wealth[k];
            }
        }
        return max;
    }
}
}

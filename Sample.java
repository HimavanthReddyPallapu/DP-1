// Time Complexity : mxn
// Space Complexity : mxn
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

class Solution {
    public int coinChange(int[] coins, int amount) {
        if(coins==null || coins.length==0)
        {
            return -1;
        }
        
        int m=coins.length;
        int n=amount;
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<n+1;i++)
        {
            dp[0][i]=amount+7549; //add any random number to consider as infinity.
        }
        
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(j<coins[i-1])
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                  dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i-1]]+1) ; 
                }
            }
            
        }
        if(dp[m][n]==amount+7549)
        {
            return -1;
        }
        return dp[m][n];
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       

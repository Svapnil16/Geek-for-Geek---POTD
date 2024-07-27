//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends




//User function Template for Java




class Solution{
    private int solve(int i, int j, String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];
        
        for (int k = n; k >= 0; k--) {
            for (int l = 0; l < n; l++) {
                if (k > l) continue;
                if (str.charAt(k) == str.charAt(l)) {
                    int a = (k + 1 < n && l - 1 >= 0) ? dp[k + 1][l - 1] : 0;
                    int b = 1 + (k + 1 < n ? dp[k + 1][l] : 0);
                    int c = 1 + (l - 1 >= 0 ? dp[k][l - 1] : 0);
                    dp[k][l] = Math.min(Math.min(a, b), c);
                } else {
                    int b = 1 + (k + 1 < n ? dp[k + 1][l] : 0);
                    int c = 1 + (l - 1 >= 0 ? dp[k][l - 1] : 0);
                    dp[k][l] = Math.min(b, c);
                }
            }
        }
        return dp[0][n - 1];
    }

    public int countMin(String str) {
        int n = str.length();
        int i = 0;
        int j = n - 1;
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(i, j, str);
    }
}

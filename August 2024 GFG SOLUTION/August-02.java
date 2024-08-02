//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int m = s.length();
        int n = t.length();
        int dp[][] = new int[m+1][n+1];
        for(int i = 0; i <= m;i++){
            for(int j = 0; j <= n;j++){
                if(i == 0){
                    dp[i][j] = j;
                }else if(j == 0){
                    dp[i][j] = i;
                }
            }
        }
        for(int i = 1;i <= m;i++){
            for(int j = 1;j <= n;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = dp[i-1][j] + 1;
                    int remove = dp[i][j-1] + 1;
                    int replace = dp[i-1][j-1] + 1;
                    dp[i][j] = Math.min(add,Math.min(replace,remove));
                }
            }
        }
        return dp[m][n];
    }
}

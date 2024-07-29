//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
      int max=0;
      int n=arr.length;
      int m=arr[0].length;
     int ans=-1;
     for(int i=n-1;i>=0;i--){
         int si=0;
         int ei=m-1;
         while(si<=ei){
             int mid=(si+ei)/2;
             if(arr[i][mid]==1){
                 ei=mid-1;
             }else{
                 si=mid+1;
             }
         }
         
         if((m-(ei+1))>=max){
             max= (m-(ei+1));
             ans=i;
         }
     }
     if(max==0){
         return -1;
     }
        return ans;
    }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends



// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
         Arrays.sort(arr);
        int n=arr[0].length();
        int m=arr[arr.length-1].length();
        int i=0;
        String res="";
        while(i<n && i<m){
            if(arr[0].charAt(i)==arr[arr.length-1].charAt(i)){
                res+=arr[0].charAt(i);
            }
            else{
                break;
            }
            i++;
        }
        if(res.equals("")){
            return "-1";
        }
        return res;
    }
}

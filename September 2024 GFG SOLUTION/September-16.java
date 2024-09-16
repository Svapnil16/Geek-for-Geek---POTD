//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String s){
        // code here
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') st.push(i);
            else {
                st.pop();
                if (!st.isEmpty()) maxLen = Math.max(maxLen, i - st.peek());
                else st.push(i);
            }
        }
        return maxLen;
    }
}

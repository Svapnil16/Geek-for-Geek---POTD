//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends



// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        String[] s=str.split("[.]");
        if(s.length!=4)
        {
            return false;
        }
        for(String i:s)
        {
            try
            {
                if(0>Integer.valueOf(i) || Integer.valueOf(i)>255 || (i.length()>1 && i.charAt(0)=='0'))
                return false;
            }
            catch(Exception e){
                return false;
            }
        }
        return true;
    }
}

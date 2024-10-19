//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {

    String roundToNearest(String str) {
         // Complete the function
        int n = str.length()-1;
        char temp[] = str.toCharArray();
        if(temp[n]<='5'){
            temp[n]='0';
            return new String(temp);
        }
        temp[n]='0';
        n--;
        while(n>=0 && temp[n]=='9'){
            temp[n]='0';
            n--;
        }
        if(n==-1)return '1' + new String(temp);
        temp[n]+=1;
        return new String(temp);
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends

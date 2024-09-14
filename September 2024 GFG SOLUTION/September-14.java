//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int i=0,j=0;
        int n=arr.size();
        int idx=0;
        int res[]=new int[n];
        while(idx<n){
            while(i<n&&arr.get(i)<0){
                i++;
            }
              if (i < n) {
                res[idx++] = arr.get(i);
                i++;
            }
            while(j<n&&arr.get(j)>=0){
                j++;
            }
              if (j < n) {
                res[idx++] = arr.get(j);
                j++;
            }
        }
     
        for(int k=0;k<n;k++){
            arr.set(k,res[k]);
        }
        
    }
}

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int arr[] = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            int[] ans = new Solution().constructLowerArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        int ls=0;
        for(int i=n-1;i>=0;i--){
            int id = add(list,ls,arr[i]);
            ans[i]=id;
            ls++;
        }
        return ans;
    }
    
    int add(List<Integer> list,int n,int x){
        int l=0, r=n-1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(list.get(mid)==x){
                r=mid-1;
            }else if(list.get(mid)>x){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        
        if(l==n){
            list.add(x);
            return l;
        }
        
        list.add(l,x);
        return l;
        
    }
}

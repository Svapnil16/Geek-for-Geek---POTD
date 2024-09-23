//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        
        int[] ans = new int[2];
        
        int n = arr.length;

       
        boolean[] visited = new boolean[n + 1];
      
        int repeating = -1, missing = -1;

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[arr[i]]) {
                repeating = arr[i];
            }
            else {
                visited[arr[i]] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                missing = i;
                break;
            }
        }
        
        ans[0] = repeating;
        ans[1] = missing;
        
        return ans;
    }
}

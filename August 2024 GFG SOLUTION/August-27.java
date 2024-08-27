//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends

class Solution {
  
  int helper(int[] arr, int i, int cur){
      for(int j = i-1; j >= 0; j--){
          if(arr[j] < cur)
            return arr[j];
      }
      return 0;
  }
   int helper2(int[] arr, int i, int cur){
      for(int j = i+1; j < arr.length; j++){
          if(arr[j] < cur)
            return arr[j];
      }
      return 0;
  }
    public int findMaxDiff(int[] arr) {
        // code here
        int[] ls = new int[arr.length];
        int[] rs = new int[arr.length];
        int n = arr.length;
        int m = rs.length;
        ls[0] = 0;
        rs[m-1] = 0;
        for(int i = 0; i < n; i++){
            ls[i] = helper(arr, i, arr[i]);
            rs[i] = helper2(arr,i,arr[i]);
        }
        int diff = -1;
        for(int i = 0; i < n; i++){
            int res = ls[i] >= rs[i] ? ls[i] - rs[i] : rs[i] - ls[i];
            if(res > diff)
              diff = res;
        }
        return diff;
    }
}

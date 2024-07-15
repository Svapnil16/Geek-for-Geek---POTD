//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends



class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        int minValue = (int) Math.pow(10, d - 1);
        int maxValue = (int) Math.pow(10, d) - 1;
        for (int i = minValue; i <= maxValue; i++) {
            int number = i;
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum == s) {
                return Integer.toString(i);
            }
        }
        return "-1";
    }
}

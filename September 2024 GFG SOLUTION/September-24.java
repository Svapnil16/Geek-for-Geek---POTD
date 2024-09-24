//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends

class Solution {
    
    public static String smallestWindow(String s, String p) {
    
        if (p.length() > s.length()) return "-1";


        int[] patternFreq = new int[256]; 
        for (char c : p.toCharArray()) {
            patternFreq[c]++;
        }

        int start = 0, minLength = Integer.MAX_VALUE;
        int startIdx = -1; 
        int matchedChars = 0;
        
        int[] windowFreq = new int[256];  


        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            windowFreq[endChar]++;
            
          
            if (patternFreq[endChar] != 0 && windowFreq[endChar] <= patternFreq[endChar]) {
                matchedChars++;
            }

        
            while (matchedChars == p.length()) {
               
                if (minLength > (end - start + 1)) {
                    minLength = end - start + 1;
                    startIdx = start;
                }

               
                char startChar = s.charAt(start);
                if (patternFreq[startChar] != 0 && windowFreq[startChar] <= patternFreq[startChar]) {
                    matchedChars--;
                }
                windowFreq[startChar]--;
                start++;
            }
        }

        
        return (startIdx == -1) ? "-1" : s.substring(startIdx, startIdx + minLength);
    }
}

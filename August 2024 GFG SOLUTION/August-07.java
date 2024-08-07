

// User function Template for Java

class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int last_element = 0;
        int i = 0,j = 0;
        
        while(k > 0)
        {
            if( i >= n )
            {
                last_element = arr2[j];
                j++;
            }
            else if( j >= m )
            {
                last_element = arr1[i];
                i++;
            }
            else
            {
                if( arr1[i] > arr2[j] )
                {
                    last_element = arr2[j];
                    j++;
                }
                else
                {
                    last_element = arr1[i];
                    i++;
                }
            }
            k--;
        }
        return last_element;
    }
}

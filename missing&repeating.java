/*

	Time complexity: O(N*log(N))
	Space complexity: O(1)

	Where N is the length of the given array.

*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {

        // sorting the array
        Collections.sort(arr);

        int r=-1, m;

        for(int i = 0; i < n - 1; i += 1)
        {
            int x=arr.get(i),y=arr.get(i+1);
            // checking if two adjacent numbers are same
            if(x==y)
            {
                r = arr.get(i);
                break;
            }
        }

        // calculating the sum of the given array
        int currSum = 0;
        for(int i = 0; i < n; i += 1)
        {
            currSum += arr.get(i);
        }

        // sum of the numbers from 1 to n
        int actualSum = n*(n + 1)/2;

        m = actualSum - (currSum - r);

        int ans[]=new int[2];

        ans[0] = m;
        ans[1] = r;

        return ans;

    }

}

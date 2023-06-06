import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long cur=0;
		long max=0;
		for(int i=0;i<n;i++){
			max +=arr[i];
			cur= Math.max(cur,max);
			if(max<0) max=0;

		}
		return cur;
	}

}

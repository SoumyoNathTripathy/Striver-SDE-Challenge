import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min =9999999;
        int maxp=0;
        for(int i=0; i<prices.size();i++){
            if(prices.get(i)<min) min=prices.get(i);    
        if((prices.get(i)-min)>maxp) maxp=prices.get(i)-min;
        }
        return maxp;
    }
}

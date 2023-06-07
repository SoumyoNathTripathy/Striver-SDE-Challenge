import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int l=0;
        int m=0;
        int h=arr.length-1;
        while(m<=h){
            switch(arr[m]){
                case 0:
                {
                    int temp= arr[l];
                    arr[l]=arr[m];
                    arr[m]=temp;
                    m++;
                    l++;
                    break;
                }
                case 1:{
                    m++;
                    break;
                }
                case 2:{
                     int temp= arr[m];
                    arr[m]=arr[h];
                    arr[h]=temp;
                    h--;
                    break;
                }

            }
        }
    }
}

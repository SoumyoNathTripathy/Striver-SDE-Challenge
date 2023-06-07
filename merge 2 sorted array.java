import java.io.*;
import java.util.*;

public class Solution {

    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}

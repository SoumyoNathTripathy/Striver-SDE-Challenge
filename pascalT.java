import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> res = new ArrayList<>();
        List<Long> row, pre = null;
        
        for (int i = 0; i < n; i++) {
            row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1L);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            
            pre = new ArrayList<>(row);
            res.add(new ArrayList<>(row));
        }
        
        return res;
    }
}

  


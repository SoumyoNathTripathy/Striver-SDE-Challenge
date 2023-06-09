/*
    Time Complexity: O(N * log(N))
    Space Complexity: O(1)

    Where N is the number of intervals.
*/

import java.util.*;

public class Solution {

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        int n = intervals.length;
        List<Interval> res = new ArrayList();

        Arrays.sort(intervals, new Comparator<Interval>() {

            public int compare(Interval a, Interval b) {
                if(a.start == b.start) {
                    return a.finish - b.finish;
                }

                return a.start - b.start;
            }

        });

        for(int i = 0; i < n; i++) {
            int curS = intervals[i].start;
            int curE = intervals[i].finish;

            if(res.size() == 0 || curS > res.get(res.size() - 1).finish) {
                res.add(intervals[i]);
            }
            else {
                res.get(res.size() - 1).finish = Math.max(res.get(res.size() - 1).finish, curE);
            }
        }

        return res;
    }

}

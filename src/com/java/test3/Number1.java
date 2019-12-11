package com.java.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 功能: 区间合并
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/10 15:07
 */
public class Number1 {

    public int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length < 1) {
            return new int[0][];
        }
        List<int[]> lists = new ArrayList<>();
        for (int[] arr : intervals) {
            lists.add(arr);
        }
        Collections.sort(lists, (l1, l2) -> l1[0] - l2[0]);
        int i = 1;
        while (i < lists.size()) {
            int start1 = lists.get(i - 1)[0];
            int end1 = lists.get(i - 1)[1];
            int start2 = lists.get(i)[0];
            int end2 = lists.get(i)[1];
            if (start2 >= start1 && start2 <= end1) {
                lists.get(i - 1)[1] = end1 > end2 ? end1 : end2;
                lists.remove(i);
            } else {
                i++;
            }
        }
        return lists.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Number1 num = new Number1();
        int[][] result = num.merge(intervals);
        for (int [] a:result){
            System.out.print("["+a[0]+","+a[1]+"]");
        }
    }
}

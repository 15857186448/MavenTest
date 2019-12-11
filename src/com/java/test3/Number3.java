package com.java.test3;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * 功能: 聪明的小偷
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/11 9:22
 */
public class Number3 {

    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 7, 5, 9, 7,4};
        System.out.println(steal(array));
    }

    public static int steal(int[] nums) {

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int max4 = 0;
        int max5 = 0;
        if (nums.length % 2 == 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                max1 += nums[i];
                i++;
            }
            for (int i = 1; i < nums.length; i++) {
                max2 += nums[i];
                i++;
            }
            return max1 > max2 ? max1 : max2;
        }
        if (nums.length % 2 == 1) {
            for (int i = 0; i < nums.length - 2; i++) {
                max3 += nums[i];
                i++;
            }
            for (int i = 1; i < nums.length - 1; i++) {
                max4 += nums[i];
                i++;
            }
            for (int i = 2; i < nums.length; i++) {
                max5 += nums[i];
                i++;
            }
            return (max3 > max4 ? max3 : max4) > max5 ? (max3 > max4 ? max3 : max4) : max5;
        }
        return 0;
    }
}

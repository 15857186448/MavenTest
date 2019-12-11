package com.java.test;

import java.util.Scanner;

/**
 * <p>
 * 功能: 和为定值的三元组
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/4 15:03
 */
public class Test3 {

//    public static void main(String[] args) {
//       int[] arr=new int[]{-8,-4,-3,0,1,2,4,5,8,9};
//
//        printUniqueTriad(arr, 10);
//    }

    //不重复打印排序数组中相加和为给定值的所有二元组
    public static void printUniquePair(int[] arr,int k){
        if (arr==null||arr.length<2){
            return;
        }
        int left=0;
        int right=arr.length-1;
        //因为是排序数组，利用左指针和右指针不断向中间压缩
        while (left<right){
            if (arr[left]+arr[right]<k){
                left++;
            }else if (arr[left]+arr[right]>k){
                right--;
            }else {
                if (left==0||arr[left-1]!=arr[left]){
                    //保证不重复打印 检查arr[left]是否和arr[left-1]相等
                    System.out.println(arr[left]+","+arr[right]);
                }
                left++;
                right--;
            }
        }
    }


    //不重复打印排序数组中相加和为给定值的所有三元组
    private static void printUniqueTriad(int[] arr, int k) {

        if (arr == null || arr.length < 3) {
            return;
        }
        //先定三元组的第一个元素，接下来找和为k-arr[i]的二元组
        for (int i = 0; i < arr.length - 2; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                //保证不重复
                printRest(arr, i, i + 1, arr.length, k - arr[i]);
            }
        }
    }

    private static void printRest(int[] arr, int first, int left, int right, int k) {
        while (left < right) {
            if (arr[left] + arr[right] < k) {
                left++;
            } else if (arr[left] + arr[right] > k) {
                right--;
            } else {
                if (left == first + 1 || arr[left - 1] != arr[left]) {
                    //保证二元组不重复
                    System.out.println(arr[first] + "," + arr[left] + "," + arr[right]);
                }
                left++;
                left--;
            }
        }

    }

}

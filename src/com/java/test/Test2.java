package com.java.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * <p>
 * 功能: 可整合数组
 * </p>
 *
 * @Author: yangmaoqiang
 * @Date: 2019/12/4 10:32
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
             arr[i]=scanner.nextInt();
        }
        for(int s:arr) {
            System.out.print(s+" ");
        }
        System.out.println("------------");
        System.out.println(getL(arr));
        System.out.println(getL2(arr));

    }


    //最长可整合子数组的长度
    public static int getL2(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }
        int len=0;
        int max=0;
        int min=0;
        HashSet<Integer> set=new HashSet<Integer>();//判断重复
        for(int i=0;i<arr.length;i++){
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if (!set.contains(arr[j])){
                    set.add(arr[j]);
                    max=Math.max(max,arr[j]);
                    min=Math.min(min,arr[j]);
                //新的检查方法：如果数组没有重复元素，且max-min+1=元素个数，则可整合
                    if (max-min==j-i){
                        len=Math.max(len,j-i+1);
                    }
                }
            }
            set.clear();
        }
        return len;
    }


    public static int getL(int[] arr){
        if (arr==null||arr.length==0){
            return 0;
        }
        int len=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                //依次考察每一个子数组arr[i..j],0<=i<=j<=N-1
                if (isIntegrated(arr,i,j)){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    //组成有序新数组，验证是否符合可整合数组的定义
    private static boolean isIntegrated(int[] arr, int left, int right) {
        int[] newArr= Arrays.copyOfRange(arr,left,right+1);
             Arrays.sort(newArr);
             for(int i=1;i<newArr.length;i++){
                 if (newArr[i-1]!=newArr[i]-1){
                     return false;
                 }
             }
        return true;
    }
}

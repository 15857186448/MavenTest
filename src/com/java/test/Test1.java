package com.java.test;

import java.util.Scanner;

/**
 * <p>
 * 功能: 打印二元数组值为给定值的所有二元组
 * </p>
 *
 * @Author: yangmaoqiang
 * @Date: 2019/12/4 12:00
 */
public class Test1 {
    /**
     * 控制台输入
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
       // System.out.println(n);
        //System.out.println(k);
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
       /** for(int s:arr){
            System.out.print(s+" ");
        }*/
        //System.out.println(result(arr,k));
        result(arr,k);
    }

    /**
     * 二元组结果
     * @param arr
     * @param k
     */
    public static void result(int[] arr,int k){

        if(arr==null||arr.length<2){
            return;
        }
        int left=0;
        int right=arr.length-1;
        while (left<right){
            if(arr[left]+arr[right]<k){
                left++;
            }else if(arr[left]+arr[right]>k){
                right--;
            }else{
                if (left==0||arr[left]!=arr[left-1]){
                    System.out.println(arr[left]+" "+arr[right]);
                }
                left++;
                right--;
            }
        }
    }
}

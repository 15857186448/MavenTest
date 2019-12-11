package com.java.test2;

/**
 * <p>
 * 功能: 斐波那数列（迭代计算速度快 而递归比较耗时）
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/9 15:46
 */
public class FeibonUnique {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
//        System.out.println(digui(60));
        System.out.println(diedai(60));
        long endTime = System.currentTimeMillis();
        System.out.println("耗时："+(startTime-endTime)/1000+"秒");

        System.out.println(f(15));
    }

    //迭代的方式
    private static long diedai(int n) {
        if (n == 1) {
            return 1;
        }
        long t1 = 0;
        long t2 = 1;
        long t3 = 0;
        for(int i=2;i<=n;i++){
            t3=t1+t2;
            t1=t2;
            t2=t3;
        }
        return t3;
    }

    //递归
    private static long digui(int n) {
        if (n==1||n==2){
            return 1;
        }
        return digui(n-1)+digui(n-2);
    }

    private static int f(int n){

        int a=1;
        int b=2;
        int c=4;
        int result=0;
        for (int i=4;i<=15;i++){
            result=a+b+c;
            a=b;
            b=c;
            c=result;
        }
        return result;
    }
}

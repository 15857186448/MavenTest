package com.java.test;

/**
 * <p>
 * 功能: 栈
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/9 13:50
 */
public class Main {
    public static void main(String[] args) {
        split(12);
    }

    public static int split(int number) {
        if (number>1){
            if (number%2!=0) System.out.println(split((number+1)/2));
            System.out.println(split(number/2));
        }
        return number;
    }
}

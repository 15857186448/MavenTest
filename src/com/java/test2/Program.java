package com.java.test2;

/**
 * <p>
 * 功能: 迭代
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/10 13:34
 */
public class Program {


   public static void Main(String[] args) {
        int i;
        int j=0;
        i = x(x(8));
    }

   public static int x(int n) {
        if (n <= 3)
            return 1;
        else
            return x(n - 2) + x(n - 4) + 1;
    }
}


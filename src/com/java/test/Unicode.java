package com.java.test;

/**
 * <p>
 * 功能: 以二进制形式输出
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/9 14:35
 */
public class Unicode {
    public static void main(String[] args) {
        int n = -10;
        String result = "";
        boolean minus = false;
        //如果该数字为负数，那么进行该负数+1之后的绝对值的二进制码的对应位取反，然后将它保存在result结果中
        if (n < 0) {
            minus = true;
            n = Math.abs(n + 1);
        }
        while (true) {
            int remainder = (!minus && n % 2 == 0) || (minus && n % 2 == 1) ? 0 : 1;
            //将余数保存在结果中
            result=remainder+result;
            n/=2;
            if (n==0){
                break;
            }
        }
        //判断是否为负数，如果是负数，那么前面所有位补1
        if(minus){
            n=result.length();
            for (int i=1;i<=32-n;i++){
                result=i+result;
            }
        }
        System.out.println(result);
    }

}

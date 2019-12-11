package com.java.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 功能: 求出所有组合
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/9 17:01
 */
public class GetAssemble2 {
    public void f(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + "");
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j) {
//                    System.out.println(arr[i] + "" + arr[j]);
//                }
//            }
//        }
        List<String> list = new ArrayList<>();
        String demo = null;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l < arr.length; l++) {
                        for (int m = 0; m < arr.length; m++) {
                            if (i != j && i != k && i != l&&i != m && j != k && j != l && j != m && k != l && k != m && l != m) {
                                demo = arr[i] + "" + arr[j] + "" + arr[k] + "" + arr[l] + "" + arr[m];
                                list.add(demo);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(list.size() + "***************");
        for (String str : list) {
           char c= str.charAt(3);
            if(c!='4'){
                System.out.print(str + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        GetAssemble2 getAssemble2 = new GetAssemble2();
        getAssemble2.f(arr);
    }

}

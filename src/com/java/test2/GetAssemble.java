package com.java.test2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p>
 * 功能: 组合
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/9 16:15
 */
public class GetAssemble {
    public static Set<String> set=new TreeSet<>();

    public static void doSet(String start,String[] sourceList,int max){
        String[] olds=start.split("_");
        if (olds.length==max){
            set.add(start.replaceAll("_","").trim());
        }else {
            for (int s=0;s<sourceList.length;s++){
                if (Arrays.asList(olds).contains(sourceList[s])){
                    continue;
                } else {
                    doSet(start+"_"+sourceList[s],sourceList,max);
                }
            }
        }
    }

    public static void doSet(String[] sourceList,int max){
        for(int start=0;start<sourceList.length;start++){
            doSet(sourceList[start],sourceList,max);
        }
    }
    public static void print(){
        System.out.println("Total:"+set.size());
        int cols=10;
        for(String str:set){
            System.out.print(str+" ");
            if (cols--==1){
                System.out.println();
                cols=10;
            }
        }
        set.clear();
    }

    public static void main(String[] args) {
        String [] strs=new String[]{"1","2","3","4","5"};
//        System.out.println();
//        System.out.println("**********1**********");
//        doSet(strs,1);
//        print();
        System.out.println();
        System.out.println("**********2**********");
        doSet(strs,5);
        print();
    }

}

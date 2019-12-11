package com.java.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 功能: 缩写校验
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/10 16:27
 */
public class Number2 {

    public static void main(String[] args) {
        Number2 nb = new Number2();
        String word="ihaveagirl";
        String abbr="ih2ea4";
        System.out.println(nb.validWordAbbreviation(word,abbr));
    }

    public boolean validWordAbbreviation(String word,String abbr) {

        if (word==null||abbr==null)return false;
        int i=0,j=0;
        while (i<word.length()&&j<abbr.length()){
            char ch1=word.charAt(i),ch2=abbr.charAt(j);
            if (ch1==ch2){
                i++;
                j++;
            }else if (ch2>='1'&&ch2<='9'){
                int start=j;
                while (j<abbr.length()&&Character.isDigit(abbr.charAt(j))) j++;
                int count=Integer.valueOf(abbr.substring(start,j));
                i+=count;
            }else return false;
        }
        return i==word.length()&&j==abbr.length();
    }

}

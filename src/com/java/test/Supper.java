package com.java.test;

/**
 * <p>
 * 功能: 内部类外部类
 * </p>
 *
 * @Author: yangmaoqiang
 * @Date: 2019/12/3 9:45
 */
public class Supper {


  //  float a=5.9f;
  //  int b=(byte)a;

    public int get(){
        System.out.println("Sub");
        return new Integer("5");
    }

    public static void main(String args[]){
        new Sub().get();
        new Supper().get();
    }



}
class Sub{
    public int get(){
        System.out.println("Supper");
        return 5;
    }
}
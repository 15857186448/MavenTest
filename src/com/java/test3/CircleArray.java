package com.java.test3;

/**
 * <p>
 * 功能: 环形数组实现队列
 * </p>
 * @Author: yangmaoqiang
 * @Date: 2019/12/11 10:08
 */
public class CircleArray {
    /**
     * 队列的最大有效值为 队列的长度-1
     * 队列的头和尾初始下标为0
     * 当头和尾的下标相等时，队列为空
     * 当(尾的下标+1)%队列的最大值==尾的下标时，
     * 加元素n,arr[last]=n,尾后移：(队列的尾+1)%最大值
     * 取元素m,arr[first]=m,头后移：(队列的头+1)%最大值
     * 队列的有效值(last-first+maxSize)%maxSize 因为环形队列 last-first可能为负数，所以需要maxSize
     */
    private int maxSize;//队列的最大值
    private int first;//队列的头部
    private int last;//队列的尾部
    private int[] arr;//队列

    public CircleArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull() {
        return (last + 1) % maxSize == first;
    }

    //判断队列是否为空
    public boolean isNull() {
        return last == first;
    }

    //添加数据
    public void add(int n) {
        if (isFull()) {
            throw new RuntimeException("队列已满，不能添加");
        }
        arr[last] = n;
        last = (last + 1) % maxSize;
    }

    //取数据
    public int get() {
        if (isNull()) {
            throw new RuntimeException("队列为空，不能取数据");
        }
        int val = arr[first];
        first = (first + 1) % maxSize;
        return val;
    }

    //队列的大小
    public int size() {
        return (last - first + maxSize) % maxSize;
    }
}

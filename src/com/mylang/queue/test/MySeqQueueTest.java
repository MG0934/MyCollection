package com.mylang.queue.test;

import com.mylang.queue.MyQueue;
import com.mylang.queue.MySeqQueue;

/**
 * description: 顺序队列测试
 * create by : Mxy
 * time : 2018-4-11 11:09:364
 */
public class MySeqQueueTest {

    public static void main(String[] args) {
        MyQueue<String> queue = new MySeqQueue<String>();
        queue.dequeue();//出栈
        System.out.println(queue.toString());
        queue.enqueue("A");// 元素在队尾入队
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        System.out.println(queue.toString());
        queue.dequeue();// 对头出队
        System.out.println(queue.toString());
    }
}

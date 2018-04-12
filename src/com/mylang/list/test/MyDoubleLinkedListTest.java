package com.mylang.list.test;

import com.mylang.list.MyDoublieLinkedList;
import com.mylang.list.MyList;

/**
 * description: 双向链表测试
 * create by : Mxy
 * time : 2018-4-11 10:24:35
 */
public class MyDoubleLinkedListTest {

    public static void main(String[] args) {
        MyList<String> list = new MyDoublieLinkedList<>();
        list.add("A");
        list.add("B");
        System.out.println(list.toString());
        list.remove(2);// 移除元素
        System.out.println(list.toString());
        list.add(5, "C");// 追加元素
        list.add(2, "D");//追加元素
        System.out.println(list.toString());
    }
}

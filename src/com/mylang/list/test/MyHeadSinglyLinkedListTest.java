package com.mylang.list.test;

import com.mylang.list.MyHeadSinglyLinkedList;
import com.mylang.list.MyList;

/**
 * description:
 * create by : Mxy
 * time : 2018-4-10 15:50:51
 */
public class MyHeadSinglyLinkedListTest {

    public static void main(String[] args) {
        MyList<String> list = new MyHeadSinglyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, new String((char) ('A' + i) + ""));
        }
        System.out.println(list.toString());
        list.remove(0);//移除第一个元素
        System.out.println(list.toString());
    }
}

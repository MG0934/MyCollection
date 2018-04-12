package com.mylang.list.test;

import com.mylang.list.MyReverseSinglyLinkedList;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MyReverseSingleLinkedListTest {
        /**
         * 测试
         *
         * @param args
         */
        public static void main(String[] args) {
            MyReverseSinglyLinkedList<Integer> rslk = new MyReverseSinglyLinkedList<Integer>();
            for (int i = 1; i < 10; i++) {
                rslk.add(0, new Integer(i));
            }
            System.out.println("单链表: " + rslk.toString());
            rslk.reverse();
            System.out.println("逆转后的单链表: " + rslk.toString());
        }
}

package com.mylang.list.test;

import com.mylang.list.MySortedHeadSinglyLinkedList;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
         */
public class MySortedHeadSingleLinkedListTest {

    public static void main(String[] args) {
        MySortedHeadSinglyLinkedList<Integer> list = new MySortedHeadSinglyLinkedList<Integer>();
        int n = 10;
        System.out.print("insert:   ");
        for (int i = 0; i < n; i++) {
            int k = (int) (Math.random() * 100);// 产生随机数
            list.add(new Integer(k));
            list.add(10*i);
            System.out.print(k + "    ");
        }
        System.out.println("\nlist  " + list.toString());
        list.removeByElement(10);
        System.out.println("\nlist  " + list.toString());
    }
}

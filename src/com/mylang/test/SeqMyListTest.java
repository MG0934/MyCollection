package com.mylang.test;

import com.mylang.MyList;
import com.mylang.MySeqList;

/**
 * description: 线性表测试demo
 * create by : Mxy
 * time : 2018-4-4 17:14:124
 */
public class SeqMyListTest {

    public static void main(String[] args) {
        // 初始化默认值容量的SeqList
        MyList<String> defalutValueList = new MySeqList<String>();

        // 添加A,B,C三个元素
        defalutValueList.add("A");
        defalutValueList.add("B");
        defalutValueList.add("C");
        // 输出元素个数
        System.out.println("defalutValueList线性表元素个数："+defalutValueList.length());
        System.out.println(defalutValueList);
        String remove = defalutValueList.remove(0);
        System.out.println(remove);
        System.out.println(defalutValueList);
        System.out.println("移除后defalutValueList线性表元素个数："+defalutValueList.length());
        // 初始化容量值为10的SeqList
        MyList<String> specifiedValueList = new MySeqList<String>(10);
        // 添加D,E,F,G四个元素
        specifiedValueList.add("D");
        specifiedValueList.add("E");
        specifiedValueList.add("F");
        specifiedValueList.add("G");
        // 输出元素个数
        System.out.println("specifiedValueList线性表元素个数："+specifiedValueList.length());
    }
}

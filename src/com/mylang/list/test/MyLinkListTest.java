package com.mylang.list.test;

import com.mylang.list.MyList;
import com.mylang.list.MySingleLinkList;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public class MyLinkListTest {
    public static void main(String[] args) {
        MyList<String> defalutValueList = new MySingleLinkList<String>();

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
    }
}
package com.mylang.list;

/**
 * description:
 * create by : Mxy
 * time : 2018-4-4 15:59:03
 */
public interface MyList<E> {

        //判断线性表是否为空，若为空则返回true
        boolean isEmpty();
        //返回线性表长度
        int length();
        //返回序号为index的对象，index的初始值为0
        E get(int index);
        //设置序号为index对象为Element，返回原对象
        E set(int index,E element);
        //插入element独享，插入后对象序号为index
        boolean add(int index ,E element);
        //插入element对象，插入位置没有约定
        boolean add(E element);
        //移除序号为index的对象，返回被移去的对象
        E remove(int index);
        //清空线性表
        void clear();
        }

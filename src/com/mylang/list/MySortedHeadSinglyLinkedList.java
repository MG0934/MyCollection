package com.mylang.list;

/**
 * description:x排序的单链表,继承至带头结点的单链表类HeadSinglyLinkedList
 * create by : Mxy
 * time : 2018-4-10 16:00:35
 */
public class MySortedHeadSinglyLinkedList<E> extends MyHeadSinglyLinkedList<E>{

    public MySortedHeadSinglyLinkedList() {
        super();
    }

    @Override
    public boolean add(E element) {
        //不能插入null或者非comparable对象
        if (element == null || !(element instanceof Comparable)){
            return false;
        }
        @SuppressWarnings("unchecked")
        Comparable<E> cmp = (Comparable<E>) element;

        Node<E> front = this.head;

        Node<E> p = front.next;

        while (p!=null && cmp.compareTo(p.data)>0){
            front = p;
            p = p.next;
        }
        // 插入元素,插入位置在p结点之前
        front.next = new Node<E>(element,p);

        if(p==null){
        // 尾插入则需要修改尾指针
            this.rear = front.next;
        }
        this.n++;
        return true;
    }

    /**
     * 删除指定对象,操作成功则返回true
     *
     * @param element
     * @return
     */

    public boolean removeByElement(E element) {
        if (element == null || !(element instanceof Comparable)) {
            return false;
        }
        @SuppressWarnings("unchecked")
        Comparable<E> cmp = (Comparable<E>) element;
        Node<E> front = this.head;
        Node<E> p = front.next;// front结点是p的前驱结点
        while (p != null && (cmp.compareTo(p.data) > 0)) {// 比较对象大小
            front = p;
            p = p.next;
        }

        if (p == null || cmp.compareTo(p.data) < 0) {// 没有找到指定的结点,删除失败
            return false;
        }
        front.next = p.next;// 删除p结点
        if (p == this.rear) {
            this.rear = front;
        }
        this.n--;
        return true;
    }
}

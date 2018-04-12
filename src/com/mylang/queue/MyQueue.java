package com.mylang.queue;

/**
 * description:队列
 * create by : Mxy
 * time : 2018-4-11 11:01:34
 */
public interface MyQueue<E> {
    /**
     * 判断队列是否为空，若为空返回true
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 元素入队，操作成功返回true
     *
     * @param element
     * @return
     */
    boolean enqueue(E element);

    /**
     * 出队，返回当前对头元素，若队列为空则返回null
     *
     * @return
     */
    E dequeue();
}

package com.mylang.stack;

/**
 * description:
 * create by : Mxy
 * time : {DATE}
 */
public interface MyStack<E> {
    /**
     * 判断栈是否为空，如果为空则返回true
     *
     * @return true or false
     */
    boolean isEmpty();

    /**
     * element元素入栈，若操作成功则返回true
     *
     * @param element 入栈元素
     * @return true or false
     */
    boolean push(E element);

    /**
     * 出栈，返回当前栈顶的元素，若栈空则返回null
     *
     * @return E
     */
    E pop();

    /**
     * 取栈顶元素值，未出栈，若栈空返回null
     *
     * @return E
     */
    E get();
}

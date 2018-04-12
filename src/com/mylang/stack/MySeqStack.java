package com.mylang.stack;

/**
 * description: 顺序栈的实现
 * create by : Mxy
 * time : 2018-4-11 10:52:04
 */
public class MySeqStack<E> implements MyStack<E> {
    private Object[] value;// 储存栈的数据元素的数组

    private int top;// 栈顶元素下标

    public MySeqStack() {// 构造默认容量的空栈
        this(16);// 初始化栈的容量为16
    }

    public MySeqStack(int capacity) {// 构造指定容量的空栈
        this.value = new Object[Math.abs(capacity)];
        this.top = -1;// 栈顶下标初始化为-1
    }

    @Override
    public boolean isEmpty() {
        return this.top==-1;
    }

    @Override
    public boolean push(E element) {

        if (element == null) {// 元素不允许为空
            return false;
        }

        if(this.top == value.length-1){
            Object[] temp = this.value;
            this.value = new Object[temp.length * 2];// 扩充数组容量为原来的数组容量的两倍
            for (int i = 0; i < temp.length; i++) {// 复制元素到新的数组
                this.value[i] = temp[i];
            }
        }

        this.top++;// 栈顶加1
        this.value[top] = element;// 把入栈的元素置于栈顶
        return true;

    }

    @Override
    public E pop() {

        if(isEmpty()){
            return null;
        }

        return (E) this.value[top--];
    }

    @Override
    public E get() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.value[top];// 返回栈顶元素，栈顶元素未改变,top不变
    }

    /**
     * 返回栈中各元素的字符串表示
     */
    @Override
    public String toString() {
        String str = "(";
        for (int i = top; i >= 0; i--) {// 从栈顶开始遍历
            if (this.value[i] != null) {
                if (i == 0) {// i为0则是栈底元素
                    str += this.value[i];
                    // break;// 遍历完栈顶元素跳出循环
                } else {
                    str += this.value[i] + ",";
                }
            }
        }
        return str + ")";
    }
}

package com.myjvm.rtda;

public class Stack<T> extends java.util.Stack<T> {
    public final int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
    }
}

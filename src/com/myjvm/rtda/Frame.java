package com.myjvm.rtda;


import com.myjvm.rtda.heap.Method;

public class Frame {
    public Method method;
    private LocalVars localVars;
    private OperandStack operandStack;
    public Thread thread;
    public int nextPc;

}

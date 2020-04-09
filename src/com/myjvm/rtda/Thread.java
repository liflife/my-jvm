package com.myjvm.rtda;

public class Thread {
  private Integer pc; //当前正在执行的指令的地址
  private Stack<Frame> stack;//当前线程栈
  public Thread(Integer maxStackSize) {
    this.pc = 0;
    this.stack = new Stack(maxStackSize);
  }
}

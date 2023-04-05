package data_structures.stacks;

import java.util.EmptyStackException;

public class StackFromArray {
  private int top;
  private final int capacity;
  private final int[] stack;

  public StackFromArray(int size) {
    top = -1;
    capacity = size;
    stack = new int[size];
  }

  public void push(int value) throws RuntimeException {
    if (!isFull()) {
      stack[++top] = value;
    } else {
      throw new RuntimeException("Stack is full");
    }
  }

  public int pop() throws EmptyStackException {
    if (!isEmpty()) {
      return stack[top--];
    } else {
      throw new EmptyStackException();
    }
  }

  public int peek() throws EmptyStackException {
    if(!isEmpty()) {
      return stack[top];
    } else {
      throw new EmptyStackException();
    }
  }

  public boolean isEmpty() {
    return top == -1;
  }
  public boolean isFull() {
    return top == capacity -1;
  }

  public int size() {
    return top + 1;
  }

  public int[] getStack() {
    return stack;
  }
}

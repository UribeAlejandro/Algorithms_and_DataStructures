package data.structures.data_structures.stacks;

import java.util.EmptyStackException;

public class StackFromArray {

  private final int capacity;
  private final int[] stack;
  private int top;

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
    if (!isEmpty()) {
      return stack[top];
    } else {
      throw new EmptyStackException();
    }
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == capacity - 1;
  }

  public int size() {
    return top + 1;
  }

  public int[] getStack() {
    int[] tempStack = new int[size()];
    System.arraycopy(stack, 0, tempStack, 0, tempStack.length);
    return tempStack;
  }
}

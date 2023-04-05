package data_structures.stacks;

import java.util.EmptyStackException;

public class StackFromArrayResizable {
  private int top;
  private int[] stack;

  private static final int INIT_CAPACITY = 8;

  public StackFromArrayResizable() {
    top = -1;
    stack = new int[INIT_CAPACITY];
  }

  public void push(int value) {
    if (isFull()) {
      resize(false, 2*stack.length);
    }
    stack[++top] = value;
  }

  public int pop() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException();
    } else {
      int item = stack[top--];
      if (shouldShrink()) {
        resize(true, stack.length/2);
      }
      return item;
    }
  }

  public int peek() throws EmptyStackException {
    if (!isEmpty()) {
      return stack[top];
    } else {
      throw new EmptyStackException();
    }

  }

  private void resize(boolean shrink, int newCapacity) {
    int[] tempStack = new int[newCapacity];

    if (shrink){
      System.arraycopy(stack, 0, tempStack, 0, newCapacity);
    } else {
      System.arraycopy(stack, 0, tempStack, 0, stack.length);
    }
    stack = tempStack;
  }

  public int size() {
    return top + 1;
  }

  public boolean isEmpty() {
    return top + 1 == 0;
  }

  private boolean isFull() {
    return top + 1 == stack.length;
  }

  private boolean shouldShrink() {
    return top > 0 && top + 1 == stack.length / 4;
  }

}

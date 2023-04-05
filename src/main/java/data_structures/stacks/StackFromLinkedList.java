package data_structures.stacks;

import data_structures.utils.ListNode;
import java.util.EmptyStackException;
import java.util.List;

public class StackFromLinkedList {
  private int size;
  private int top;
  private ListNode stack;

  public StackFromLinkedList() {
    size = -1;
    stack = null;
  }

  public void push(int value) {
    size++;
    stack = new ListNode(value, stack);
  }

  public int pop() throws EmptyStackException {
    if (stack == null) {
      throw new EmptyStackException();
    } else {
      size--;
      top = stack.val;
      stack = stack.next;
      return top;
    }
  }

  public int peek() throws EmptyStackException {
    if(stack == null) {
      throw new EmptyStackException();
    } else {
      return stack.val;
    }
  }

  public boolean isEmpty() {
    return stack == null;
  }

  public int size() {
    return size + 1;
  }

}

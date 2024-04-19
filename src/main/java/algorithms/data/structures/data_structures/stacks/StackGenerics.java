package data.structures.data_structures.stacks;

import data.structures.data_structures.utils.ListNodeGeneric;
import java.util.EmptyStackException;

public class StackGenerics<Item> {

  private int size;
  private Item top;
  private ListNodeGeneric<Item> stack;

  public StackGenerics() {
    size = -1;
    stack = null;
  }

  public void push(Item value) {
    size++;
    stack = new ListNodeGeneric<>(value, stack);
  }

  public Item pop() throws EmptyStackException {
    if (stack == null) {
      throw new EmptyStackException();
    } else {
      size--;
      top = stack.val;
      stack = stack.next;
      return top;
    }
  }
}

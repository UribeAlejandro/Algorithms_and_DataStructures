package data.structures.data_structures.stacks;

import data.structures.data_structures.utils.ListNodeGeneric;
import java.util.EmptyStackException;
import java.util.Iterator;

public class IterableStack<Item> implements Iterable<Item> {

  private int size;
  private Item top;
  private ListNodeGeneric<Item> stack;

  public IterableStack() {
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

  public Iterator<Item> iterator() {
    return new ListIterator();
  }

  private class ListIterator implements Iterator<Item> {

    private ListNodeGeneric<Item> current = stack;

    public boolean hasNext() {
      return current != null;
    }

    public Item next() {
      Item item = current.val;
      current = current.next;
      return item;
    }
  }
}

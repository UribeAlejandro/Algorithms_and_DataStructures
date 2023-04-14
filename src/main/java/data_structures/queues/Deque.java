package data_structures.queues;

import data_structures.utils.ListNodeGeneric;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * {@code Dequeue}. A double-ended queue or deque (pronounced “deck”) is a generalization of a stack
 * and a queue that supports adding and removing items from either the front or the back of the data
 * structure.
 * <p>
 * Corner cases.
 * <p>
 * - Throw an IllegalArgumentException if the client calls either <em>addFirst()</em> or addLast()
 * with a null argument.
 * <p>
 * - Throw a java.util.NoSuchElementException if the client calls either removeFirst() or removeLast
 * when the deque is empty.
 * <p>
 * - Throw a java.util.NoSuchElementException if the client calls the next() method in the iterator
 * when there are no more items to return.
 * <p>
 * - Throw an UnsupportedOperationException if the client calls the remove() method in the
 * iterator.
 *
 * @param <Item> Wrapper class, e.g. Integer, Long, String, etc
 */
public class Deque<Item> implements Iterable<Item> {

  private final static int INIT_CAPACITY = 8;
  private int size;
  private Item[] deque;
  private int front;
  private int back;

  public Deque() {
    size = 0;
    deque = Item<>[INIT_CAPACITY];

  }

  public boolean isEmpty() {
  }

  public int size() {
  }

  public void addFirst(Item item) throws IllegalArgumentException {
  }

  public void addLast(Item item) throws IllegalArgumentException {
  }

  public Item removeFirst() throws NoSuchElementException {
  }

  public Item removeLast() {
  }

  private boolean isFull() {

  }

  public Iterator<Item> iterator() {
    return new Deque.ListIterator();
  }

  private class ListIterator implements Iterator<Item> {

    private ListNodeGeneric<Item> current = stack;

    public boolean hasNext() {
      return current != null;
    }

    public Item next() throws NoSuchElementException {
      throw new NoSuchElementException();
    }

    public void remove() throws UnsupportedOperationException {
      throw new UnsupportedOperationException();
    }
  }

}

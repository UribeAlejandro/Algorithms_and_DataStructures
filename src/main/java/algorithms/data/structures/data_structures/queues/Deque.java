package data.structures.data_structures.queues;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * {@code Dequeue}. A double-ended queue or deque (pronounced “deck”) is a generalization of a stack
 * and a queue that supports adding and removing items from either the front or the back of the data
 * structure.
 *
 * <p>Corner cases.
 *
 * <p>- Throw an IllegalArgumentException if the client calls either <em>addFirst()</em> or
 * <em>addLast()</em> with a null argument.
 *
 * <p>- Throw a java.util.NoSuchElementException if the client calls either <em>removeFirst()</em>
 * or <em>removeLast()</em> when the deque is empty.
 *
 * <p>- Throw a java.util.NoSuchElementException if the client calls the next() method in the
 * iterator when there are no more items to return.
 *
 * <p>- Throw an UnsupportedOperationException if the client calls the remove() method in the
 * iterator.
 *
 * @param <Item> Wrapper class, e.g. Integer, Long, String, etc
 */
public class Deque<Item> implements Iterable<Item> {

  private int size;
  private Node<Item> head;
  private Node<Item> tail;

  public Deque() {
    head = null;
    tail = null;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public void addFirst(Item item) throws IllegalArgumentException {
    if (item == null) {
      throw new IllegalArgumentException();
    } else {
      Node<Item> newHead = new Node<>();

      if (isEmpty()) {
        newHead.prev = null;
        newHead.item = item;
        newHead.next = null;
        head = newHead;
        tail = newHead;
      } else {
        newHead.prev = null;
        newHead.item = item;
        newHead.next = head;
        head.prev = newHead;
        head = newHead;
      }

      size++;
    }
  }

  public void addLast(Item item) throws IllegalArgumentException {
    if (item == null) {
      throw new IllegalArgumentException();
    } else {
      Node<Item> newTail = new Node<>();
      if (isEmpty()) {
        newTail.item = item;
        newTail.next = null;
        newTail.prev = null;
        head = newTail;
        tail = newTail;
      } else {
        newTail.next = null;
        newTail.item = item;
        newTail.prev = tail;
        tail.next = newTail;
        tail = newTail;
      }
      size++;
    }
  }

  public Item removeFirst() throws NoSuchElementException {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    Item item = head.item;
    if (size == 1) {
      head = null;
      tail = null;
    } else {
      head = head.next;
      head.prev = null;
    }
    size--;
    return item;
  }

  public Item removeLast() throws NoSuchElementException {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    Item item = tail.item;
    if (size == 1) {
      tail = null;
      head = null;
    } else {
      tail = tail.prev;
      tail.next = null;
    }
    size--;
    return item;
  }

  public Iterator<Item> iterator() {
    return new DequeIterator();
  }

  private static class Node<Item> {

    private Item item;
    private Node<Item> next;
    private Node<Item> prev;
  }

  private class DequeIterator implements Iterator<Item> {

    private Node<Item> current;

    public DequeIterator() {
      current = head;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Item next() throws NoSuchElementException {
      if (hasNext()) {
        Item item = current.item;
        current = current.next;
        return item;
      } else {
        throw new NoSuchElementException();
      }
    }

    @Override
    public void remove() throws UnsupportedOperationException {
      throw new UnsupportedOperationException();
    }
  }
}

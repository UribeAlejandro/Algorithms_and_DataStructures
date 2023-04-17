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
 * - Throw an IllegalArgumentException if the client calls either <em>addFirst()</em> or
 * <em>addLast()</em> with a null argument.
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
      Node<Item> node = new Node<>();
      node.prev = null;
      node.item = item;
      tail.prev = node;
      head = node;
      if (isEmpty()) {
        node.next = null;
        tail = node;
      } else {
        node.next = tail;
      }
      size++;
    }

  }

  public void addLast(Item item) throws IllegalArgumentException {
    if (item == null) {
      throw new IllegalArgumentException();
    } else {
      Node<Item> node = new Node<>();
      node.item = item;
      node.next = null;
      tail = node;
      if (isEmpty()) {
        node.prev = null;
        head = node;
      } else {
        node.prev = tail;
      }
      size++;
    }
  }

  public Item removeFirst() throws NoSuchElementException {
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      Item item = head.item;
      head = head.next;
      head.prev = null;

      return item;
    }
  }

  public Item removeLast() throws NoSuchElementException {
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
    }
  }

  public Iterator<Item> iterator() {
  }

  private static class Node<Item> {

    private Item item;
    private Node<Item> next;
    private Node<Item> prev;
  }

}

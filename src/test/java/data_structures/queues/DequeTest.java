package data_structures.queues;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DequeTest {

  private Deque<Integer> dequeBackwards;
  private Deque<Integer> dequeForward;
  private Deque<Integer> dequeMixed;
  private Deque<Integer> emptyDeque;

  @BeforeEach
  void setUp() {
    dequeBackwards = new Deque<>();
    dequeBackwards.addFirst(0);
    dequeBackwards.addFirst(1);

    dequeForward = new Deque<>();
    dequeForward.addLast(0);
    dequeForward.addLast(1);

    dequeMixed = new Deque<>();
    dequeMixed.addLast(1);
    dequeMixed.addFirst(0);

    emptyDeque = new Deque<>();
  }

  @Test
  void isEmpty() {
    assertTrue(emptyDeque.isEmpty());
    assertFalse(dequeBackwards.isEmpty());

    dequeBackwards.removeFirst();
    assertFalse(dequeBackwards.isEmpty());

    dequeBackwards.removeFirst();
    assertTrue(dequeBackwards.isEmpty());
  }

  @Test
  void size() {
    assertEquals(0, emptyDeque.size());

    assertEquals(2, dequeBackwards.size());
    dequeBackwards.removeFirst();
    assertEquals(1, dequeBackwards.size());
    dequeBackwards.removeFirst();
    assertEquals(0, dequeBackwards.size());
  }

  @Test
  void addFirst() {
    assertThrows(IllegalArgumentException.class, () -> {
      emptyDeque.addFirst(null);
    });
  }

  @Test
  void addLast() {
    assertThrows(IllegalArgumentException.class, () -> {
      emptyDeque.addLast(null);
    });
  }

  @Test
  void removeFirst() {
    assertThrows(NoSuchElementException.class, () -> {
      emptyDeque.removeFirst();
    });

    assertEquals(1, dequeBackwards.removeFirst());
    assertEquals(0, dequeBackwards.removeFirst());

    assertEquals(0, dequeForward.removeFirst());
    assertEquals(1, dequeForward.removeFirst());

    assertEquals(0, dequeMixed.removeFirst());
    assertEquals(1, dequeMixed.removeFirst());
  }

  @Test
  void removeLast() {
    assertThrows(NoSuchElementException.class, () -> {
      emptyDeque.removeLast();
    });

    assertEquals(0, dequeBackwards.removeLast());
    assertEquals(1, dequeBackwards.removeLast());

    assertEquals(1, dequeForward.removeLast());
    assertEquals(0, dequeForward.removeLast());

    assertEquals(1, dequeMixed.removeLast());
    assertEquals(0, dequeMixed.removeLast());
  }

  @Test
  void iterator() {
    Iterator<Integer> iterator = emptyDeque.iterator();
    assertFalse(iterator.hasNext());
    assertThrows(NoSuchElementException.class, iterator::next);

    iterator = dequeForward.iterator();
    assertEquals(0, iterator.next());
    assertEquals(1, iterator.next());
    assertThrows(NoSuchElementException.class, iterator::next);
    assertThrows(UnsupportedOperationException.class, iterator::remove);

    iterator = dequeBackwards.iterator();
    assertEquals(1, iterator.next());
    assertEquals(0, iterator.next());
    assertThrows(NoSuchElementException.class, iterator::next);
    assertThrows(UnsupportedOperationException.class, iterator::remove);
  }
}

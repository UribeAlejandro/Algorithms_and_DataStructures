package algorithms.data.structures.data_structures.queues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import data.structures.data_structures.queues.QueueFromLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueFromLinkedListTest {

  private QueueFromLinkedList queue;

  @BeforeEach
  void setUp() {
    queue = new QueueFromLinkedList();
  }

  @Test
  void enqueue() {
    queue.enqueue(0);
    assertEquals(1, queue.size());
    queue.enqueue(0);
    assertEquals(2, queue.size());
  }

  @Test
  void dequeue() {
    assertThrows(
        NullPointerException.class,
        () -> {
          queue.dequeue();
        });
    queue.enqueue(0);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    assertEquals(0, queue.dequeue());
  }

  @Test
  void isEmpty() {
    assertTrue(queue.isEmpty());

    queue.enqueue(0);
    assertFalse(queue.isEmpty());
  }
}

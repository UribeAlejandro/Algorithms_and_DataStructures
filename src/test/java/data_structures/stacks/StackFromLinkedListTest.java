package data_structures.stacks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackFromLinkedListTest {

  private StackFromLinkedList stack;

  @BeforeEach
  void setUp() {
    stack = new StackFromLinkedList();
  }

  @Test
  void push() {
    stack.push(1);
    assertEquals(1, stack.peek());
    stack.push(2);
    assertEquals(2, stack.peek());
  }

  @Test
  void pop() {
    stack.push(1);
    stack.push(2);
    stack.push(3);
    assertEquals(3, stack.pop());
    assertEquals(2, stack.pop());
    assertEquals(1, stack.pop());

    assertThrows(EmptyStackException.class, ()-> {stack.pop();});
  }

  @Test
  void peek() {
    stack.push(1);
    stack.push(2);
    assertEquals(2, stack.peek());
    stack.pop();
    assertEquals(1, stack.peek());
    stack.pop();
    assertThrows(EmptyStackException.class, () -> {stack.peek();});
  }

  @Test
  void isEmpty() {
    assertTrue(stack.isEmpty());
    stack.push(1);
    assertFalse(stack.isEmpty());
  }

  @Test
  void size() {
    assertEquals(0, stack.size());
    stack.push(1);
    assertEquals(1, stack.size());
    stack.push(1);
    assertEquals(2, stack.size());
  }
}

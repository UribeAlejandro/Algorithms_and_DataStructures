package data_structures.stacks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackFromArrayResizableTest {

  private StackFromArrayResizable stack;

  @BeforeEach
  void setUp() {
    stack = new StackFromArrayResizable();
  }

  @Test
  void push() {
    stack.push(0);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    stack.push(7);
    stack.push(8);
    stack.push(9);
    assertEquals(10, stack.size());
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    assertThrows(EmptyStackException.class, () -> {
      stack.pop();
    });
  }

  @Test
  void pop() {
    assertThrows(EmptyStackException.class, () -> {
      stack.pop();
    });
    stack.push(1);
    stack.push(2);
    assertEquals(2, stack.pop());
    assertEquals(1, stack.pop());
  }

  @Test
  void peek() {
    assertThrows(EmptyStackException.class, () -> {
      stack.peek();
    });

    stack.push(1);
    assertEquals(1, stack.peek());
  }

  @Test
  void getSize() {
    assertEquals(0, stack.size());
    stack.push(1);
    assertEquals(1, stack.size());
  }

  @Test
  void isEmpty() {
    assertTrue(stack.isEmpty());

    stack.push(1);
    assertFalse(stack.isEmpty());

    stack.pop();
    assertTrue(stack.isEmpty());
  }
}

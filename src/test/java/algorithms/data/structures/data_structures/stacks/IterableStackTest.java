package algorithms.data.structures.data_structures.stacks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import data.structures.data_structures.stacks.IterableStack;
import java.util.Iterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IterableStackTest {

  private IterableStack<Integer> stack;

  @BeforeEach
  void setUp() {
    stack = new IterableStack<>();
  }

  @Test
  void push() {
    stack.push(1);
    assertEquals(1, stack.pop());
  }

  @Test
  void iterator() {
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    Iterator<Integer> s = stack.iterator();
    for (int i = 4; i >= 1; i--) {
      assertEquals(i, s.next());
    }
  }
}

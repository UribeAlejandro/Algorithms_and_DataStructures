package data_structures.stacks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackFromArrayTest {
  private StackFromArray stackFromArray;

  @BeforeEach
  void setUp() {
    stackFromArray = new StackFromArray(2);
  }

  @Test
  void push() {
    stackFromArray.push(1);
    assertEquals(1, stackFromArray.peek());

    stackFromArray.push(2);
    assertThrows(RuntimeException.class, () -> {
      stackFromArray.push(2);});
  }

  @Test
  void pop() {
    stackFromArray.push(1);
    stackFromArray.push(2);
    assertEquals(2, stackFromArray.pop());
    assertEquals(1, stackFromArray.pop());
    assertThrows(EmptyStackException.class, () -> {
      stackFromArray.pop();});
  }

  @Test
  void peek() {
    assertThrows(EmptyStackException.class, ()-> {
      stackFromArray.peek();});
  }

  @Test
  void isEmpty() {
    assertTrue(stackFromArray.isEmpty());
  }

  @Test
  void isFull() {
    assertFalse(stackFromArray.isFull());
    stackFromArray.push(1);
    stackFromArray.push(2);
    assertTrue(stackFromArray.isFull());
  }

  @Test
  void size() {
    assertEquals(0, stackFromArray.size());
    stackFromArray.push(1);
    assertEquals(1, stackFromArray.size());
  }

  @Test
  void getStack() {
    stackFromArray.push(1);
    stackFromArray.push(2);
    assertArrayEquals(new int[]{1,2}, stackFromArray.getStack());
  }
}

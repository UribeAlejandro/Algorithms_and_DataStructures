package algorithms.data.structures.data_structures.stacks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import data.structures.data_structures.stacks.StackGenerics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackGenericsTest {

  private StackGenerics<String> stackString;
  private StackGenerics<Integer> stackInteger;

  @BeforeEach
  void setUp() {
    stackString = new StackGenerics<>();
    stackInteger = new StackGenerics<>();
  }

  @Test
  void push() {
    String expectedS = "Hello";
    stackString.push(expectedS);
    assertEquals(expectedS, stackString.pop());

    Integer expectedI = Integer.valueOf(1);
    stackInteger.push(expectedI);
    assertEquals(expectedI, stackInteger.pop());
  }

  @Test
  void pop() {
  }
}

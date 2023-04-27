package algorithms.shuffle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KnuthShuffleTest {

  private int N;
  private int[] arr;
  private int[] arr2;

  @BeforeEach
  void setUp() {
    arr = new int[]{};
    arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  }

  @Test
  void shuffle() {
    N = arr.length;
    int[] shuffled = KnuthShuffle.shuffle(arr);
    assertEquals(N, shuffled.length);

    N = arr2.length;
    shuffled = KnuthShuffle.shuffle(arr2);
    assertEquals(N, shuffled.length);

  }
}

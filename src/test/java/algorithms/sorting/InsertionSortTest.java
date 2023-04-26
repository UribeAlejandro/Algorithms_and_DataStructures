package algorithms.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

  private int[] arr;
  private int[] arr1;
  private int[] arr2;

  @BeforeEach
  void setUp() {
    arr = new int[]{0, -1, -2, -3, -4};
    arr1 = new int[]{3, 2, 1, 0};
    arr2 = new int[]{0};
  }

  @Test
  void sort() {
    int[] sortedArr = InsertionSort.sort(arr);
    assertArrayEquals(new int[]{-4, -3, -2, -1, 0}, sortedArr);

    sortedArr = InsertionSort.sort(arr1);
    assertArrayEquals(new int[]{0, 1, 2, 3}, sortedArr);

    sortedArr = InsertionSort.sort(arr2);
    assertArrayEquals(new int[]{0}, sortedArr);
  }
}

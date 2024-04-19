package data.structures.algorithms.sorting;

public class InsertionSort {

  public static int[] sort(int[] arr) {
    int N = arr.length;
    for (int i = 0; i < N; i++) {
      for (int j = i; j > 0; j--) {
        if (less(arr[j], arr[j - 1])) {
          exchange(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
    return arr;
  }

  private static boolean less(int v, int w) {
    return v < w;
  }

  private static void exchange(int[] arr, int i, int j) {
    int swap = arr[i];
    arr[i] = arr[j];
    arr[j] = swap;
  }
}

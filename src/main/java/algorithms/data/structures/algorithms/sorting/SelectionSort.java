package data.structures.algorithms.sorting;

public class SelectionSort {

  public static int[] sort(int[] arr) {
    int N = arr.length;
    for (int i = 0; i < N; i++) {
      int min = i;
      for (int j = i + 1; j < N; j++) {
        if (less(arr[j], arr[min])) {
          min = j;
        }
      }
      exchange(arr, i, min);
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

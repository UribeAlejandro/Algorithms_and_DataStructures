package algorithms.sorting;

public class ShellSort {

  public static int[] sort(int[] arr) {
    int h = 1;
    int N = arr.length;

    while (h < N / 3) {
      h = 3 * h + 1;
    }

    while (h >= 1) {
      for (int i = h; i < N; i++) {
        for (int j = i; j >= h && less(arr[j], arr[j - h]); j -= h) {
          exchange(arr, j, j - h);
        }
      }
      h = h / 3;
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

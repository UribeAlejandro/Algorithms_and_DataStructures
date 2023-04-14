package algorithms.sorting;

public class SelectionSort {

  public static void sort(Comparable[] arr) {
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
  }

  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }

  private static void exchange(Comparable[] arr, int i, int j) {
    Comparable swap = arr[i];
    arr[i] = arr[j];
    arr[j] = swap;
  }
}

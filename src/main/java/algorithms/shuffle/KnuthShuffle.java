package algorithms.shuffle;

import java.util.Arrays;
import java.util.Random;

public class KnuthShuffle {

  public static int[] shuffle(int[] arr) {
    int N = arr.length;
    Random random = new Random();
    for (int i = 0; i < N; i++) {
      int position = random.nextInt(N);
      exchange(arr, i, position);
    }

    System.out.println(Arrays.toString(arr));
    return arr;
  }

  private static void exchange(int[] arr, int i, int j) {
    int swap = arr[i];
    arr[i] = arr[j];
    arr[j] = swap;
  }
}

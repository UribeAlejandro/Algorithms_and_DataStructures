package data.structures.data_structures.queues;

public class QueueFromArray {

  private final int[] queue;
  private final int CAPACITY;
  private int size;
  private int first;
  private int last;

  public QueueFromArray(int capacity) {
    first = -1;
    last = -1;
    size = 0;
    CAPACITY = capacity;
    queue = new int[capacity];
  }

  public void enqueue(int value) throws ArrayIndexOutOfBoundsException {
    if (!isFull()) {
      if (isEmpty()) {
        first++;
      }
      size++;
      queue[++last] = value;
    } else {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  public int dequeue() {
    if (!isEmpty()) {
      size--;
      return queue[first--];
    } else {
      // FIXME: This is being thrown even when queue is not empty
      throw new NullPointerException();
    }
  }

  public boolean isEmpty() {
    return first + 1 == 0;
  }

  public boolean isFull() {
    return first + 1 == 0 && last + 1 == CAPACITY;
  }

  public int size() {
    return size;
  }
}

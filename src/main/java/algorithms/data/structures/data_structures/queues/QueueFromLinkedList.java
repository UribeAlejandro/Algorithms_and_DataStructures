package data.structures.data_structures.queues;

import data.structures.data_structures.utils.ListNode;

public class QueueFromLinkedList {

  private int size;
  private ListNode first;
  private ListNode last;

  public QueueFromLinkedList() {
    size = 0;
    first = null;
  }

  public void enqueue(int value) {
    size++;
    ListNode oldLast = last;
    last = new ListNode(value, null);
    if (isEmpty()) {
      first = last;
    } else {
      oldLast.next = last;
    }
  }

  public int dequeue() throws NullPointerException {
    int value = first.val;
    first = first.next;
    size--;

    if (isEmpty()) {
      throw new NullPointerException();
    }
    return value;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public int size() {
    return size;
  }
}

package data.structures.data_structures.utils;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static List<Integer> ListNodeToArray(ListNode head) {
    List<Integer> a = new ArrayList<>();

    while (head.next != null) {
      a.add(head.val);
      head = head.next;
    }
    if (head.next == null) {
      a.add(head.val);
    }
    System.out.println(a);

    return a;
  }
}

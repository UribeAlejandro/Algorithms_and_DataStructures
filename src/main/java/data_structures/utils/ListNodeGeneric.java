package data_structures.utils;

public class ListNodeGeneric<Item> {

  public Item val;
  public ListNodeGeneric<Item> next;

  public ListNodeGeneric() {
  }

  public ListNodeGeneric(Item val) {
    this.val = val;
  }

  public ListNodeGeneric(Item val, ListNodeGeneric<Item> next) {
    this.val = val;
    this.next = next;
  }
}

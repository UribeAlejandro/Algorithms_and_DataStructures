package data.structures.data_structures.utils;

public class BinaryTreeNode {

  private int root;
  private BinaryTreeNode left;
  private BinaryTreeNode right;

  public BinaryTreeNode(int root) {
    this.root = root;
    this.left = null;
    this.right = null;
  }

  public int getRoot() {
    return root;
  }

  public void setRoot(int root) {
    this.root = root;
  }

  public BinaryTreeNode getLeft() {
    return left;
  }

  public void setLeft(BinaryTreeNode left) {
    this.left = left;
  }

  public BinaryTreeNode getRight() {
    return right;
  }

  public void setRight(BinaryTreeNode right) {
    this.right = right;
  }
}

package edu.byu.cs329.hw0;

/**
 * An abstract ListNode object for the Visitor Pattern.
 *
 * @author byu cs329
 */
public abstract class ListNode {

  protected ListNode next;

  /**
   * Public constructor.
   */
  public ListNode() {
    this.next = null;
  }

  /**
   * Public constructor setting the next node.
   *
   * @param next the next node
   */
  public ListNode(ListNode next) {
    this.next = next;
  }

  /**
   * Accepts a ListNodeVisitor.
   *
   * @param v the visitor to accept
   */
  public abstract void accept(ListNodeVisitor v);

}

package edu.byu.cs329.hw0;

/**
 * Boolean Node.
 *
 * @author byucs329
 */
public class BooleanNode extends ListNode {

  private boolean value;

  /**
   * Public Constructor.
   *
   * @param value value
   */
  public BooleanNode(boolean value) {
    this.value = value;
  }

  /**
   * Public constructor.
   *
   * @param value value
   * @param next  next
   */
  public BooleanNode(boolean value, ListNode next) {
    this.value = value;
    this.next = next;
  }

  /**
   * Gets boolean.
   *
   * @return value
   */
  public boolean getBoolean() {
    return value;
  }

  /**
   * Accepts visitor node.
   */
  public void accept(ListNodeVisitor v) {
    boolean doTraverseNext = v.visit(this);

    if (doTraverseNext) {
      if (next != null) {
        next.accept(v);
      }
    }

    v.endVisit(this);
  }

}

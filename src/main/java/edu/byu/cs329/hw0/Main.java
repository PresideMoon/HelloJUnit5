package edu.byu.cs329.hw0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Contains the main method.
 *
 * @author byu cs329
 */
public class Main {
  static Logger logger = LoggerFactory.getLogger("tooling");
  
  /**
   * Creates new nodes and output results of visitors.
   *
   * @param args Command line arguments
   */
  public static void main(String[] args) {
    CharacterNode n7 = new CharacterNode('!');
    BooleanNode n6 = new BooleanNode(false, n7);
    NumberNode n5 = new NumberNode(316, n6);
    CharacterNode n4 = new CharacterNode('s', n5);
    NumberNode n3 = new NumberNode(13, n4);
    CharacterNode n2 = new CharacterNode('c', n3);
    BooleanNode n1 = new BooleanNode(true, n2);

    BuildStringVisitor bsv = new BuildStringVisitor();
    n1.accept(bsv);
    MultipleVisitor mv = new MultipleVisitor();
    n1.accept(mv);

    logger.trace("Trace!");
    logger.debug("Debug!");
    logger.info("Info!");
    logger.warn("Warn!");
    logger.error("Error!");
    System.out.println("Compare the results of the two visitors:");
    System.out.println("BuildStringVisitor: " + bsv.getResult());
    System.out.println("MultipleVisitor: " + mv.getResult());
  }
}

package Blatt6;

import aud.BinaryTree;
import aud.example.expr.AtomicExpression;
import aud.example.expr.ExpressionParser;
import aud.example.expr.ExpressionTree;

//-----------------------------------------------------------------//
/**Class which is able the compute the derivative of a given
   `ExpressionTree` with respect to a user specified variable.*/
public class Differentiation {
  //----------------------------------------------------------------//
  public static ExpressionTree differentiate(BinaryTree<AtomicExpression> t, String var) {
    // TODO: - implement a method which computes the derivative of the
    //         given tree `t` with respect to `var`
    ExpressionParser expPar = new ExpressionParser();
    expPar.setVerbose(true);
    t = expPar.parse(var);
    return null;
  }

  //----------------------------------------------------------------//
  public static void main(String[] args) {
    // TODO: test your code with appropriate examples
  }
}

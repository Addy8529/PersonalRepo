package Blatt5;

//Gruppenarbeit von Muhammad Ahad (Gr.5), Gurpreet Singh Chandi(Gr.4) und Shashank Shorya(Gr. 5)

import aud.example.expr.ExpressionParser;
import aud.example.expr.ExpressionTree;
import aud.example.expr.Number;
import aud.example.expr.Plus;
import aud.example.expr.Times;
import aud.example.expr.Divide;
import aud.example.expr.Minus;
import aud.util.*;                    //to use DotViewer, SingleStepper


//------------------------------------------------------------------//
public class ExampleExpression  {
    //----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: create an appropriate example which uses ExpressionParser
        //       and ExpressionTree
        String input = "((2 * 5) + ((6 / 2) - 3))";
        ExpressionTree expTree = new ExpressionTree(
                new Times(),
                new ExpressionTree(new Plus(),
                        new ExpressionTree(new Number(2)),
                        new ExpressionTree(new Number(5))),
                new ExpressionTree(new Minus(),
                        new ExpressionTree(new Divide(),
                                new ExpressionTree(new Number(6)),
                                new ExpressionTree(new Number(2))),
                        new ExpressionTree(new Number(3))));

         //created Parser
        ExpressionParser expPar = new ExpressionParser();
        expPar.setVerbose(true);
        ExpressionTree newTree = expPar.parse(input);

        //tests

        System.out.println("input string: " + newTree + ", " + "espTree: " + expTree);
        System.out.println("Inorder: " + newTree.inorder() + ", " + "espTreeInorder: " + expTree.inorder());
        System.out.println("Preorder: " + newTree.preorder() + ", " + "espTreePreorder: " + expTree.preorder());
        System.out.println("Postorder: " + newTree.postorder() + ", " + "espTreePostorder: " + expTree.postorder());
        System.out.println("value of expressions input and expTree: " + newTree.getValue() + " and " + expTree.getValue());
        DotViewer.displayWindow(newTree, "input");
        DotViewer.displayWindow(expTree, "expTree");
    }
}
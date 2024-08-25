package Blatt6;

import aud.example.expr.*;  //to extend ExpressionParser2
import aud.util.*;

//gruppearbeit von Muhammad Ahad (Gr.5), Gurpreet Singh Chandi(Gr.4) und Shashank Shorya(Gr. 5)

/**ExpressionParser which is able the process `power to`.*/
public class ExprWithPow extends ExpressionParser2{

    // TODO: maybe overwrite some methods

    protected ExpressionTree product(int level) {

        ExpressionTree left = this.pow(level + 1);
        ExpressionTree right;
        if (this.lookahead() == Tokenizer.TIMES) {
            this.nextToken();
            right = this.product(level + 1);
            return new ExpressionTree(new Times(), left, right);
        } else if (this.lookahead() == Tokenizer.DIVIDE) {
            this.nextToken();
            right = this.product(level + 1);
            return new ExpressionTree(new Divide(), left, right);
        } else {
            return left;
        }
    }

    //----------------------------------------------------------------//
    public ExpressionTree pow(int level) {
        // TODO: - implement this method which handles `power to` input
        //       - feel free to find a better solution without using this
        //         method

        /** parse pow<p>
          pow ::= <factor> | <number> "^" <number>

        */

        ExpressionTree left = factor(level + 1);
        ExpressionTree right;
        if (lookahead() == Tokenizer.POWER) {
            nextToken();
            right = pow(level + 1);
            return new ExpressionTree(new Power(), left, right);
        } else {
            return left;
        }

    }

    //----------------------------------------------------------------//
    public static void main(String[] args) {

        ExprWithPow test = new ExprWithPow();
        String str = "2^4";
        System.out.println(test.parse(str).getValue());

        ExpressionTree Tree = test.parse(str);
        DotViewer.displayWindow(Tree, "Pow");

    }
}


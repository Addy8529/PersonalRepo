package Blatt5;

import aud.BinaryTree;
import aud.util.DotViewer;

import java.util.Iterator;


class IntBinTree extends BinaryTree<Integer> {
    //---------------------------------------------------------------//
    Integer max=Integer.MIN_VALUE;
    public IntBinTree(int data) {
        super(data);
    }

    //---------------------------------------------------------------//
    public IntBinTree(int data, IntBinTree left, IntBinTree right) {
        super(data, left, right);
    }

    //---------------------------------------------------------------//
    public int height() {
        // TODO: implement to return the height of the current (sub-)tree

        return h_height(this);

    }

    // Creating a Help function for height
    public int h_height(BinaryTree<Integer> root) {

        if (root == null) {
            return 0;
        }
        return 1 + Math.max(h_height(root.getLeft()), h_height(root.getRight()));

    }

    //---------------------------------------------------------------//

    public int maxSum() {
        // TODO: implement to return bigger sum of the left/right subtree

        return Math.max(h_maxSum(this.getLeft()), h_maxSum(this.getRight()));

    }

    // help Function for Max Sum
    public int h_maxSum(BinaryTree<Integer> root) {

        if (root == null) {
            return 0;

        } else {

            int sum = h_maxSum(root.getLeft()) + h_maxSum(root.getRight()) + root.getData();

            return sum;

        }
    }


    //---------------------------------------------------------------//
    public int maxPath() {

       Iterator<BinaryTree<Integer>> iterator=this.preorder().iterator();


        while (iterator.hasNext()) {

               this.max=Math.max(this.max,h_maxPath(iterator.next()));
       }
       return this.max;
    }


    // help function for max Path
    public int h_maxPath(BinaryTree<Integer> root) {


        int Sum = root.getData();

        while (!(root.isRoot())){

            root=root.getParent();
            Sum +=root.getData();

    }
        return Sum;
}

    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples
        IntBinTree LeftChild2 = new IntBinTree(-11,null,null);
        IntBinTree LeftChild3 = new IntBinTree(10,null,null);
        IntBinTree RightChild1 = new IntBinTree(5,null,null);
        IntBinTree RightChild2 = new IntBinTree(7,null,null);
        IntBinTree LeftChild1 = new IntBinTree(6,LeftChild3,null);
        IntBinTree RightParent = new IntBinTree(1,RightChild1,RightChild2);
        IntBinTree LeftParent= new IntBinTree(4,LeftChild1,LeftChild2);
        IntBinTree root = new IntBinTree(-8,LeftParent,RightParent);

        DotViewer.displayWindow(root,"View");

        System.out.println(root.height());
        System.out.println(root.maxSum());
        System.out.println(root.maxPath());



    }
}




package B7;

import aud.AVLTree;
import aud.RedBlackTree;
import aud.util.DotViewer;
import aud.util.SingleStepper;

//-----------------------------------------------------------------//
public class RedBlackExample {
  //---------------------------------------------------------------//
  public static void main(String[] args) {
    RedBlackTree<Integer,Integer> tree =new RedBlackTree<>();
    AVLTree<Integer,Integer> AvlTree =new AVLTree<>();
    int[] input ={6,7,3,4,2,1};
    DotViewer red_black =DotViewer.displayWindow(tree,"Red-Black Tree");
    DotViewer avl =DotViewer.displayWindow(tree,"AVL-TREE");
    SingleStepper steps = new SingleStepper("");

    for(int i :input){
      steps.halt("insert :"+i);
      tree.insert(i,i);
      AvlTree.insert(i,i);
      red_black.display(tree);
      avl.display(AvlTree);
    }


  }
}


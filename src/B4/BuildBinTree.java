package B4;

import aud.BinaryTree;
import aud.util.DotViewer;

public class BuildBinTree {


  public static void main(String[] args) {
    BinaryTree<Integer> a=new BinaryTree<>(-8);
    BinaryTree<Integer> b=new BinaryTree<>(4);
    BinaryTree<Integer> c=new BinaryTree<>(1);
    BinaryTree<Integer> d=new BinaryTree<>(6);
    BinaryTree<Integer> e=new BinaryTree<>(-11);
    BinaryTree<Integer> f=new BinaryTree<>(5);
    BinaryTree<Integer> g=new BinaryTree<>(7);

    a.setLeft(b);
    a.setRight(c);
    b.setLeft(d);
    b.setRight(e);
    c.setLeft(f);
    c.setRight(g);

    System.out.println("preorder : ["+a.preorder()+"]");
    System.out.println("inorder  : ["+a.inorder()+"]");
    System.out.println("postorder: ["+a.postorder()+"]");
    System.out.println("levelorder:["+a.levelorder()+"]");

    DotViewer.displayWindow(a,"Tree");

  }
}

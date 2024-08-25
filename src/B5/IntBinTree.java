package B5;

import aud.BinaryTree;

import java.util.Iterator;

public class IntBinTree extends BinaryTree<Integer> {
  //---------------------------------------------------------------//
  Integer max=Integer.MIN_VALUE;
  public IntBinTree(int data) {
    super(data);
  }


  //---------------------------------------------------------------//

  public int height(){
    return height(this);
  }
  public int maxSum(){
    return maxSum(this);
  }


  public static int height(BinaryTree<Integer> tree) {

    if(tree==null){
      return 0;
    }else{
     return Math.max(height(tree.getLeft()),height(tree.getRight()))+1;
    }

  }


  //---------------------------------------------------------------//

  public static int sum(BinaryTree<Integer> tree){
    int sum =0;
    for (BinaryTree<Integer> integerBinaryTree : tree.inorder()) {
      sum += integerBinaryTree.getData();
    }
    return sum;
  }
  public static int maxSum(BinaryTree<Integer> tree) {


    if(tree ==null){
      return 0;
    }else {
      return Math.max(sum(tree.getLeft()),sum(tree.getRight()));
    }

  }

  //---------------------------------------------------------------//
  public int maxPath() {
    return maxPath_(this);
  }


  // help function for max Path

  public int maxPath_(BinaryTree<Integer> root) {
    int max=0;
    int sum=0;

    Iterator<BinaryTree<Integer>>  iterator=root.inorder().iterator();
    BinaryTree<Integer> tmp;
    while(iterator.hasNext()){
      if((tmp=iterator.next()).isLeaf()){

        while(!tmp.isRoot()){
          sum+=tmp.getData();
          tmp=tmp.getParent();
        }
        sum+=tmp.getData();
        max=Math.max(max,sum);
      }
    }
    return max;
  }



  //---------------------------------------------------------------//
  public static void main(String[] args) {

    IntBinTree a =new IntBinTree(-8);
    IntBinTree b =new IntBinTree(4);
    IntBinTree c =new IntBinTree(6);
    IntBinTree d =new IntBinTree(10);
    IntBinTree e =new IntBinTree(-11);
    IntBinTree f =new IntBinTree(1);
    IntBinTree g =new IntBinTree(5);
    IntBinTree h =new IntBinTree(7);


    a.setLeft(b);
    b.setLeft(c);
    c.setLeft(d);
    b.setRight(e);
    a.setRight(f);
    f.setLeft(g);
    f.setRight(h);

    System.out.println("height : "+a.height());
    System.out.println("maxSum : "+a.maxSum());
    System.out.println("maxPath :"+a.maxPath());



  }
}

package B5;

import aud.BinaryTree;
import aud.util.DotViewer;

import java.util.Iterator;

//------------------------------------------------------------------//
public class MyBinTree<T> extends BinaryTree<T> {
  //----------------------------------------------------------------//
  public MyBinTree(T data) {
    super(data);
  }

  //----------------------------------------------------------------//
  public int maxWidth() {
    // TODO:
    // - implement to return the maximum width of the binary tree
    // - you can use a queue for your solution
    Iterator<BinaryTree<T>> iterator=this.levelorder().iterator();

    int level = 1,width = 1,maxWidth =1;
    while(iterator.hasNext()){
      BinaryTree<T> tmp =iterator.next();
      if(get_level(tmp)==level){
        width++;
      }else{
        level++;
        maxWidth=Math.max(maxWidth,width);
        width=1;
      }
    }
    return maxWidth;
  }
  public  int get_level(BinaryTree<T> tree){
    int level=1;

    while(!tree.isRoot()){
      tree =tree.getParent();
      level++;
    }
return level;
  }
  public BinaryTree find(int x){
    BinaryTree<T> tmp=this;
    while (tmp!=null){
      if(tmp.getData().equals(x)){
        return tmp;
      } else if (x<(int)tmp.getData()) {
        tmp=tmp.getLeft();
      }else tmp=tmp.getRight();

    }
    return null;
  }
  //---------------------------------------------------------------//
  public static void main(String[] args) {

    MyBinTree<Integer> a =new MyBinTree<>(-8);
    MyBinTree<Integer> b =new MyBinTree<>(4);
    MyBinTree<Integer> c =new MyBinTree<>(6);
    MyBinTree<Integer> d =new MyBinTree<>(10);
    MyBinTree<Integer> e =new MyBinTree<>(-11);
    MyBinTree<Integer> f =new MyBinTree<>(1);
    MyBinTree<Integer> g =new MyBinTree<>(5);
    MyBinTree<Integer> h =new MyBinTree<>(7);


    a.setLeft(b);
    b.setLeft(c);
    c.setLeft(d);
    b.setRight(e);
    a.setRight(f);
    f.setLeft(g);
    f.setRight(h);
    System.out.println(a.maxWidth());
    DotViewer.displayWindow(a,"");

    System.out.println(a.find(3));
  }
}

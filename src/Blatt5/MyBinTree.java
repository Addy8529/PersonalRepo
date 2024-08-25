package Blatt5;

import aud.BinaryTree;
import aud.Queue;
import aud.util.DotViewer;
           //Gruppenarbeit von Muhammad Ahad ,Shashank Shorya und Gurpreet Singh Chandi//
//------------------------------------------------------------------//
public class MyBinTree<T> extends BinaryTree<T> {
  //----------------------------------------------------------------//
  public MyBinTree(T data) {
    super(data);
  }

  //----------------------------------------------------------------//
  public MyBinTree(T data,MyBinTree<T> left,MyBinTree<T> right) {
    super(data, left, right);
  }

  //----------------------------------------------------------------//
  public int maxWidth() {

    //initial Width of tree
    int max_width=1;

    // size =nodes per level
      int size=0;

    //created a Queue
    Queue<BinaryTree<T>> queue=new Queue<>();

    //inserted root to initialize queue
    queue.enqueue(this);

    //inserted null to keep track of levels of tree
    queue.enqueue(null);


   do{
     // created temporary tree
      BinaryTree<T> temp= queue.front();

      // removing trees from queue
      queue.dequeue();

      //sets max_width for each level
      if(temp==null){
        max_width=Math.max(max_width,size);

        //resets size

        size=0;

        //adds null between levels
        if(!(queue.is_empty())){
          queue.enqueue(null);
        }
        continue;
      }
      // checks if temp has left or right nodes and inserts in queue
      if(temp.getLeft()!=null){queue.enqueue(temp.getLeft());size++;}
      if(temp.getRight()!=null){queue.enqueue(temp.getRight());size++;}



    } while (!(queue.is_empty())); // loop runs until queue is not empty

    return max_width;

  }




  //---------------------------------------------------------------//
  public static void main(String[] args) {
    // Tests
    MyBinTree<Integer> a1=new MyBinTree<>(1);
    MyBinTree<Integer> a2=new MyBinTree<>(2);
    MyBinTree<Integer> a3=new MyBinTree<>(3);
    MyBinTree<Integer> a4=new MyBinTree<>(4);
    MyBinTree<Integer> a7=new MyBinTree<>(7);
      MyBinTree<Integer> a8=new MyBinTree<>(7);



    a1.setLeft(a2);
    a1.setRight(a3);
    a3.setLeft(a7);
    a7.setRight(a4);


    System.out.println("level order: "+a1.levelorder());
    DotViewer.displayWindow(a1,"View");
    System.out.println(a1.maxWidth());
      System.out.println("a8:"+a8.maxWidth());

  }
}

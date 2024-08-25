//Gruppenarbeit von Muhammad Ahad ,Shashank Shorya und Gurpreet Singh Chandi
package Blatt8;

import aud.BTree;
import aud.KTreeNode;
import aud.util.DotViewer;
import aud.util.SingleStepper;


           //Teil 2

public class MyBTree<Key extends Comparable<Key>> extends BTree<Key> {



    public MyBTree(int m) {
        super(m);
    }

    public int getHeight(){
  int Height=0;
    KTreeNode<Key> node=root();

    while (node!=null){
        node=node.getChild(0);
        Height++;
    }
        return Height;
}
    public static void main(String[] args) {

        MyBTree<Integer> BTree= new MyBTree<>(2);


        //Teil 3-----------------

        Integer[] array={6,18,22,3,11,16,7,10,1,8,12};
        DotViewer Display=DotViewer.displayWindow(BTree,"DotViewer");
        SingleStepper singleStepper=new SingleStepper("SingleStepper");
        for(int i=0;i<array.length;i++){
            BTree.insert(array[i]);
            singleStepper.halt(String.valueOf(array[i]));
            Display.display(BTree);
            System.out.println( BTree.getHeight());
        }
        singleStepper.halt("End");
         System.exit(0);
        //----------------------------
/*
        //Teil 4
        Random random=new Random();
        int count=0;
       while(count<1000000) {
           int num=random.nextInt(1000000);
           BTree.insert(num);
           count++;

       }
       System.out.println("Count: "+count);
       System.out.println( "Height: "+BTree.getHeight());
*/




    }
}

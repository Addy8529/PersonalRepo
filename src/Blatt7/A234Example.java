package Blatt7;

import aud.A234Tree;
import aud.util.DotViewer;
import aud.util.SingleStepper;
//GruppenArbeit von Muhamamd Ahad, Shashank Shorya und Gurpreet Singh Chandi
//-----------------------------------------------------------------//
public class A234Example {
  //---------------------------------------------------------------//
  public static void main(String[] args) {

    int[] A={3,7,5,15,17,9,13,21,11,19};
    int[] B={3,7,5,9,11,13,15,17,19,21};

    A234Tree<Integer> tree1_UP= new A234Tree<>(false);
    A234Tree<Integer> tree1_TOP= new A234Tree<>(true);

    DotViewer A2=DotViewer.displayWindow(tree1_TOP,"Top_Down");
    DotViewer A1=DotViewer.displayWindow(tree1_UP,"Bottom_up");

    SingleStepper singleStepper=new SingleStepper("");

    for(int i=0;i<A.length;i++){
    //  tree1_UP.insert(A[i]);
     tree1_TOP.insert(A[i]);
     tree1_UP.insert(A[i]);

      singleStepper.halt("");
      A1.display(tree1_UP);
      A2.display(tree1_TOP);

    }
  }
}

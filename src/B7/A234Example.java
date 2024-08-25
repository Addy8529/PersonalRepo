package B7;

import aud.A234Tree;
import aud.util.DotViewer;
import aud.util.SingleStepper;

//-----------------------------------------------------------------//
public class A234Example {
  //---------------------------------------------------------------//
  public static void main(String[] args) {

    int[] array1 ={3, 7, 5, 15, 17, 9, 13, 21, 11,19};
    int[] array2 ={3, 5, 7, 9, 11, 13, 15, 17, 19,21 };
    A234Tree<Integer> tree =new A234Tree<>(true);
    A234Tree<Integer> tree2 =new A234Tree<>(false);
    DotViewer display= DotViewer.displayWindow(tree,"top_down");
    DotViewer display2= DotViewer.displayWindow(tree2,"bottom_up");
    SingleStepper stepper= new SingleStepper("");

    for(int i :array1){
      tree.insert(i);
      tree2.insert(i);
      display.display(tree);
      display2.display(tree2);
      stepper.halt();
    }



   tree =new A234Tree<>(true);
    tree2 =new A234Tree<>(false);
    for(int i:array2){

      tree.insert(i);
      tree2.insert(i);
      display.display(tree);
      display2.display(tree2);
      stepper.halt();
    }

  }
}

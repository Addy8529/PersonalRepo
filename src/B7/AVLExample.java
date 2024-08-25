package B7;


import aud.AVLTree;
import aud.util.DotViewer;
import aud.util.SingleStepper;

//-----------------------------------------------------------------//
public class AVLExample {
  //---------------------------------------------------------------//
  public static void main(String[] args) {
    AVLTree<Integer,Integer> tree =new AVLTree<>();
    DotViewer Display=DotViewer.displayWindow(tree,"Tree");
    SingleStepper stepper =new SingleStepper("");
    int[] array ={2,6,7,4,3,5,1};

    for(int i: array){
      tree.insert(i,null);
      stepper.halt();
      Display.display(tree);
    }

  }
}

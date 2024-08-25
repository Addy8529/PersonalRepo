package Blatt7;

import aud.AVLTree;
import aud.util.DotViewer;
import aud.util.SingleStepper;

// gruppearbeit von Muhammad Ahad (Gr.5), Gurpreet Singh Chandi(Gr.4) und Shashank Shorya(Gr. 5)

public class AVLExample {
        //---------------------------------------------------------------//
        public static void main(String[] args) {
            // TODO: Test your example with DotViewer and SingleStepper
            AVLTree<Integer, Integer> Baum = new AVLTree<>();
            DotViewer View = DotViewer.displayWindow(Baum,"AVL Tree");
            SingleStepper Stepper = new SingleStepper("Steps");

            int [] a = {14,15,17,7,5,10,16}; //created an Array with given Values

            for(int i = 0; i <a.length;i++){ // for loop till the array length

                Baum.insert(a[i],null); // inserting the values
                Stepper.halt(String.valueOf(a[i])); // shows steps
                View.display(Baum);
            }
        }

}

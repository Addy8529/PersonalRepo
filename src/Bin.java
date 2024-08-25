import aud.BinaryTree;
import aud.util.DotViewer;

public class Bin {

    public static BinaryTree  _insert(BinaryTree Parent ,BinaryTree child){
       Integer C=(Integer) child.getData();
       Integer P=(Integer) Parent.getData();

        if(C>P){
            Parent.setRight(child);
        }else
            Parent.setLeft(child);




        return  null;
    }
    public static void main(String[] args) {
        BinaryTree<Integer> root = new BinaryTree<Integer>(8);
        BinaryTree <Integer> Leftparent =  new BinaryTree <Integer>(9);
        BinaryTree <Integer> eftparent =  new BinaryTree <Integer>(7);
        BinaryTree <Integer> ftparent =  new BinaryTree <Integer>(6);
        BinaryTree <Integer> tparent =  new BinaryTree <Integer>(5);
        _insert(root,Leftparent);
        _insert(root,eftparent);

        DotViewer.displayWindow(root,"ABC");



    }
}

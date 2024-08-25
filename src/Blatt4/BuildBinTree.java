package Blatt4;

import aud.util.DotViewer;
import aud.BinaryTree;



public class BuildBinTree {
    public static void main(String[] args) {
        // TODO: implement a class to visualise the binary tree

        BinaryTree <String> root = new BinaryTree <>("8");
        BinaryTree <String> Leftparent =  new BinaryTree <>("4");
        BinaryTree <String> Rightparent = new BinaryTree <>("1");
        BinaryTree <String> Leftchild = new BinaryTree <>("6");
        BinaryTree <String> Leftchild2 = new BinaryTree <>("-11");
        BinaryTree <String> Rightchild = new BinaryTree <>("5");
        BinaryTree <String> Rightchild2 = new BinaryTree <>("7");

        root.setLeft(Leftparent);
        root.setRight(Rightparent);
        Leftparent.setLeft(Leftchild);
        Leftparent.setRight(Leftchild2);
        Rightparent.setLeft(Rightchild);
        Rightparent.setRight(Rightchild2);

        System.out.print(" PreOrder : ");
        System.out.println(root.preorder());
        System.out.print(" inorder : ");
        System.out.println(root.inorder());
        System.out.print(" PostOrder : ");
        System.out.println(root.postorder());
        System.out.print(" levelorder : ");
        System.out.print(root.levelorder());

        // Output as Dotview
        DotViewer.displayWindow(root,"View");

    }
}
package Blatt7;

import aud.BinarySearchTree;
import aud.BinaryTree;


class IsBalanced<T extends Comparable<T>> extends BinaryTree <T>{


    public IsBalanced(T data) {
        super(data);
    }

    public  boolean isBalanced(){
        return false;
    }
     BinaryTree<T> inorderNext(){
        BinarySearchTree.Iterator iter= (BinarySearchTree.Iterator) this.inorder().iterator();
         return this.inorderNext();

    }
}

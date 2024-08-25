package Exam2012;

import aud.Queue;

public class BinaryTree {
    int Data;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int data, BinaryTree left, BinaryTree right) {
        Data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return Data;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }
    public int maxLevelSum(){
        Queue<BinaryTree> q =new Queue<>();
        int maxSum =0;
        q.enqueue(this);

        while(!q.is_empty()){
            int sum  =0;
            
        }

        return 0;

    }
}

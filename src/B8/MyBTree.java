package B8;

import aud.BTree;

public class MyBTree<Key extends Comparable<Key>> extends BTree<Key> {

    /**
     * create an empty tree of order 2*m+1
     *
     * @param m
     */
    public MyBTree(int m) {
        super(m);
    }
    public int getHeight(){
        return 0;
    }

    public static void main(String[] args) {

    }
}

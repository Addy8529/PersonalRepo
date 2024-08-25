package B3;

import aud.DList;

public class RNode {
    int data=Integer.MAX_VALUE;
    RNode prev;
    RNode next;

    public RNode(int data, RNode prev, RNode neex, DList<RNode> list) {
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.list = list;
    }

    DList<RNode> list;
    public void insert_before(RNode n,RNode position){
        int x   =n.data;
        int y   =position.data;

        RNode oldNode =find(x);
        RNode newNode =find(y);
        RNode temp=oldNode.prev;

        oldNode.prev=newNode;
        newNode.next=oldNode;
        newNode.prev=temp;
        temp.next=newNode;





    }
    public RNode find(int x){
        int i=0;
        RNode node=new RNode(0,null,null,null);
        while(list.iterator().hasNext()){
            if(i==x){
                int j=0;
                while( j!=x){
                 node=  list.iterator().next();
                }
                return node;
            } else if (i!=x && list.iterator().hasNext()) {
                i++;
            }

        }
        return null;
    }
}

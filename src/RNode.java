public class RNode {
    int Data=Integer.MAX_VALUE;
    RNode prev=null;
    RNode next=null;
    public RNode(){}

   public RNode(int Data,RNode prev,RNode next){
        this.Data=Data;
        this.prev=prev;
        this.next=next;
   }

    public void insert_before(RNode n, RNode position){
        n.next=position.next.prev;
        n.prev=position.prev;
        position.prev=n.next.prev;





    }
    public RNode find(int x){
        RNode newNode=new RNode();
        while(this.Data!=x&&next==null){
            newNode=newNode.next;
        }return null;
    }

    public static void main(String[] args) {




    }
}

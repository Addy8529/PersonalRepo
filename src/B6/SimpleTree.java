package B6;

//-----------------------------------------------------------------//
public class SimpleTree<T extends Comparable<T>> {
  //---------------------------------------------------------------//
  public class Node {

    private T data;
    private Node left;
    private Node right;

      public Node(T data) {
      this.data = data;
    }

    public Node(T data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }

  }

  //---------------------------------------------------------------//
  private Node root_;

  //---------------------------------------------------------------//


  public SimpleTree() {
    root_=null;
  }

  //---------------------------------------------------------------//
  public void add(T obj) {

    if (root_ == null) {
      root_ = new Node(obj);
    } else {
      Node current = root_;
      while (true) {
        if (obj.compareTo(current.data) < 0) {
          if (current.left == null) {
            current.left = new Node(obj);
            break;
          } else {
            current = current.left;
          }
        } else if (obj.compareTo(current.data) > 0) {
          if (current.right == null) {
            current.right = new Node(obj);
            break;
          } else {
            current = current.right;
          }
        } else {
          break;
        }
      }
    }
    }




  //---------------------------------------------------------------//
  public boolean contains(T obj) {

    Node Current =root_;
    while(Current!=null) {
      if(Current.data.compareTo(obj)<0){
        Current=Current.right;
      } else if (Current.data.compareTo(obj)>0) {
        Current=Current.left;

      }else return true;

    }
   return false;
  }

  //---------------------------------------------------------------//
  public String toString() {
    // TODO: implementation
    StringBuilder output = new StringBuilder();
    inOrder(root_, output);
    return output.toString().trim();



  }
  private void inOrder(Node node, StringBuilder output) {
    if (node != null) {
      inOrder(node.left, output);
      output.append(node.data).append(" ");
      inOrder(node.right, output);
    }
  }

  //---------------------------------------------------------------//
  public static void main(String[] args) {

    SimpleTree<Integer> tree=new SimpleTree<>();
    tree.add(5);
    tree.add(6);
    tree.add(4);
    tree.add(10);
    tree.add(5);
    System.out.println(tree);
    System.out.println(tree.contains(11));
  }
}

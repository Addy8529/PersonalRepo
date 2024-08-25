package B4;

import java.util.Iterator;
import java.util.Stack;

/**ForwardList represents a list with single linked nodes, that do have
   a next-pointer. */
public class ForwardList<T> implements Iterable<T>{
  //-----------------------------------------------------------------//
  //------------- !!Do not change the following lines!! -------------//
  public String toString() {
    if (is_empty())
      return "[]";
    String rv = "[";
    Node node = head_;
    do {
      rv += node.data_.toString();
      if (node.next_ != head_)
        rv += ",";
      node = node.next_;
    } while(node != null);
    rv += "]";
    return rv;
  }

  //-----------------------------------------------------------------//
  //---------------- !!Insert your solution below!! -----------------//
  // A Node is a single element in the list
  public class Node {
    //---------------------------------------------------------------//
    //    !!! Do not change the existing lines in class Node!!!      //
    //            !!! It is allowed to add new content !!!           //
    //       !!! It is not allowed to add a previous pointer !!!     //
    //---------------------------------------------------------------//
    public T data_;
    public Node next_ ;

    public Node(T data, Node next) {
      data_ = data;
      next_ = next;
    }
  }

  //-----------------------------------------------------------------//
  public Node head_ = null;

  //-----------------------------------------------------------------//
  public ForwardList()
  {}

  //-----------------------------------------------------------------//
  public void push_front(T obj) {
    this.head_= new Node(obj,head_);
  }

  //-----------------------------------------------------------------//
  public boolean is_empty() {
    return this.head_==null;
  }

  //-----------------------------------------------------------------//
  public void backTraverse() {

    //created a list to save the orignal list backwards
    ForwardList<T> reversed_list =new ForwardList<>();
    //created a node to travers forward
    Node temp=this.head_;

    // Travers the list forward
    while(temp!=null){
      reversed_list.push_front(temp.data_);
      temp=temp.next_;
    }

    //travers the copy backwards
    Node temp2= reversed_list.head_;
    System.out.print("[");
    while(temp2!=null){
      System.out.print(temp2.data_+",");
      temp2=temp2.next_;
    }
    System.out.print("]");
  }

  //-----------------------------------------------------------------//
  public class BackIterator implements java.util.Iterator<T> {
    Stack<Node> stack;

    public BackIterator() {
      this.stack = new Stack<>();
      Node  node =head_;
      while(node!=null){
        stack.push(node);
        node=node.next_;
      }
    }



    @Override
    public boolean hasNext() {
      return !stack.empty();
    }

    @Override
    public T next() {
      
      return stack.pop().data_;
    }

    @Override
    public void remove() {
      Iterator.super.remove();
    }
  }

  //-----------------------------------------------------------------//
  public BackIterator iterator() {
return new BackIterator();
  }

  //-----------------------------------------------------------------//
  public static void main(String[] args) {
    // TODO: test your code with appropriate examples
    ForwardList<Integer> li =new ForwardList<>();

    for (int  i=10;i>=0;i--){
      li.push_front(i);
    }
    System.out.println("Original List : "+li);
    System.out.print("Backtraversed : ");
    li.backTraverse();
    System.out.println();
    System.out.print("Reversed list : [");
    for(int i:li){
      System.out.print(i+",");
    }
    System.out.println("]");
  }
}
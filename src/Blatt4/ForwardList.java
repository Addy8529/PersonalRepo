package Blatt4;

import aud.Stack;
import java.util.Iterator;
/**Blatt4.ForwardList represents a list with single linked nodes, that do have
   a next-pointer. */
                // Gruppenarbeit mit Muhammad Ahad, Gurpreet Singh Chandi und Shashank Shorya
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
    rv+= "]";
    return rv;
  }

  //-----------------------------------------------------------------//
  //---------------- !!Insert your solution below!! -----------------//
  //A Node is a single element int the ring
  public  class Node {
    //---------------------------------------------------------------//
    //    !!! Do not change the existing lines in class Node!!!      //
    //            !!! It is allowed to add new content !!!           //
    //       !!! It is not allowed to add a previous pointer !!!     //
    //---------------------------------------------------------------//
    public T data_;
    public Node next_;

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
                                // TODO: implement adding elements to the front of the list
   head_=new Node(obj,head_);     // replaced older head with new node
  }

  //-----------------------------------------------------------------//
  public boolean is_empty() {
                                 // TODO: should return `true` if the list is empty else `false`

    return head_==null;          // returns ture if head== null
  }

  //-----------------------------------------------------------------//

  public void backTraverse() {
                                 // TODO: implement a recursive method to print out reversed
     this.copy();                 // calls copy

   }
    public void copy(){              // this method copies the caller but is reversed order
     ForwardList<T> newList=new ForwardList<>();
     while(this.head_!=null){
       newList.push_front(head_.data_);
       head_=head_.next_;
     }
      System.out.println("NewList: "+newList);

  }


    //-----------------------------------------------------------------//
    public class BackIterator implements java.util.Iterator<T> {
    Stack<Node> st;   // created a stack



      @Override
      public boolean hasNext() {  //  returns true if the stack is not empty
       return !st.is_empty();
      }

      @Override
      public T next() {
        return st.pop().data_;      // returns top element and removes it from stack
      }

      @Override
      public void remove() {
        Iterator.super.remove();
      }
      // TODO: implement an iterator that provides a reveres iteration
      public BackIterator() {
        //  the list is pushed into a stack
        st =new Stack<>();
        Node n=head_;
        while (n!=null){
          st.push(n);
          n=n.next_;}

      }
    }

    //-----------------------------------------------------------------//
    public BackIterator iterator () {
      // TODO: return an instance of the iterator

      return new BackIterator();
      //
    }

    //-----------------------------------------------------------------//
    public static void main (String[]args){
      // TODO: test your code with appropriate examples
      ForwardList<Integer> li = new ForwardList<Integer>();
      li.push_front(1);
      li.push_front(2);
      li.push_front(3);

      System.out.println("li: " + li);
      li.backTraverse();



    }
  }

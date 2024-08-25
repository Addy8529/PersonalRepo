
package B3;

import java.util.Arrays;

/**MySList represents a single linked list, which holds elements of type
   integer.*/
public class MySList implements Iterable<Integer> {
  //-----------------------------------------------------------------//
  //------------- !!Do not change the following lines!! -------------//
  public String toString() {
    if (empty())
      return "[]";
    String rv = "[";
    Node node = head_;
    do {
      rv += node.data_;
      if (node.next_ != null)
        rv += ",";
      node = node.next_;
    } while(node != null);
    rv += "]";
    return rv;
  }

  //-----------------------------------------------------------------//
  //---------------- !!Insert your solution below!! -----------------//
  /**Node represents a single element in the list.*/
  class Node {
    int data_;                         //!! Do not change this line !
    Node next_;

    public Node(int data_, Node next_) {
      this.data_ = data_;
      this.next_ = next_;
    }

    public Node(int data_) {
      this.data_ = data_;
    }
  }

  //----------------------------------------------------------------//
  Node head_;

  public MySList() {
    this.head_ = null;
  }

  public boolean empty(){
    return this.head_==null;
  }



  //----------------------------------------------------------------//


  //----------------------------------------------------------------//
  // TODO: implement (at least) a function to insert an element
  //       into MySList

  public void push_back(int obj){

    if(empty()){
      head_= new Node(obj,null);
    }else{
      Node n=head_;
      while(n.next_!=null){
        n=n.next_;
      }
      n.next_=new Node(obj,null);
    }



  }

  //----------------------------------------------------------------//
  /**Iterator is used to traverse odd elements in a list.*/
  public class Iterator implements java.util.Iterator<Integer> {
    Node node_;

    public Iterator(Node node) {
      node_ = node;
    }

    @Override
    public boolean hasNext() {

      Node n = node_;
      while (n != null) {
        if (n.data_ % 2 != 0) {
          return true;
        }
        n = n.next_;
      }
      return false;
    }

    @Override
    public Integer next() {

      while (node_ != null) {
        if (node_.data_ % 2 != 0) {
          Integer data = node_.data_;
          node_ = node_.next_;
          return data;
        }
        node_ = node_.next_;
      }
      return null;
    }

  }


  //----------------------------------------------------------------//
  public Iterator iterator() {return new Iterator(head_);}

  //----------------------------------------------------------------//
  public static void main(String[] args) {
    // TODO: test your code with appropriate examples
    int[] array = new int[16];
    MySList sList =new MySList();

    for(int i=0;i<=15;i++){
      array[i]=i;
    }
    System.out.println(Arrays.toString(array));

    for(int i:array){
      sList.push_back(i);
    }

    for(int i:sList){
      System.out.println(i);
    }
  }
}

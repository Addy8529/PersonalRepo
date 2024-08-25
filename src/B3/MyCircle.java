package B3;

public class MyCircle<T> {
  //-----------------------------------------------------------------//
  //------------- !!Do not change the following lines!! -------------//
  //A Node is a single element int the ring
  class Node {
    T data_;
    Node next_;
    Node prev_;

    Node(T obj, Node prv, Node nxt) {
      data_ = obj;
      prev_ = prv;
      next_ = nxt;
    }
  }

  //--- class members
  protected Node head_;

  //--- class methods
  public   MyCircle() { head_ = null; }
  public T front()    { return head_.data_; }
  public String toString() {
    if (empty())
      return "[]";
    String rv = "[";
    Node node = head_;
    do {
      rv += node.data_.toString();
      if (node.next_ != head_)
        rv += ",";
      node = node.next_;
    } while(node != head_);
    rv += "]";
    return rv;
  }

  //-----------------------------------------------------------------//
  //---------------- !!Insert your solution below!! -----------------//
  public int size() {
    if (head_ == null) {
      return 0; // List is empty
    } else {
      int count = 0;
      Node current = head_;
      do {
        count++;
        current = current.next_;
      } while (current != head_);
      return count;
    }
  }
  //-----------------------------------------------------------------//
  public boolean empty() {
    return (head_==null);

  }

  //-----------------------------------------------------------------//
  public void push_back(T obj) {

    if(empty()){
      head_ = new Node(obj, null, null);
      head_.next_ = head_;
      head_.prev_ = head_;
    }else {
      Node new_node =new Node(obj, head_.prev_, head_);
      Node tempLast = head_.prev_;
      tempLast.next_ = new_node;
      head_.prev_ = new_node;

    }
  }

  //-----------------------------------------------------------------//
  public void pop_front() {
    if(this.size() == 0){
      System.out.println("empty list");
    }else if(this.size() == 1){
      head_ = null;
    }else{
      Node temp1 = head_.prev_;
      Node temp2 = head_.next_;
      head_ = temp2;
      temp2.prev_ = temp1;
      temp1.next_ = temp2;
    }


  }

  //-----------------------------------------------------------------//
  public static void main(String[] args) {
    // TODO: test your code with appropriate examples
    MyCircle<Integer> circle =new MyCircle<>();
    System.out.println(circle.empty());
    for(int i=0;i<=10;i++){
      circle.push_back(i);
    }
    System.out.println(circle.size());
    System.out.println(circle.empty());
    System.out.println(circle);
    circle.pop_front();
    System.out.println(circle);




  }
}

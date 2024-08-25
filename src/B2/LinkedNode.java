package B2;

public class LinkedNode<T> {
  T data_ = null;
  LinkedNode<T> next_ = null;

  public LinkedNode(T data_, LinkedNode<T> next_) {
    this.data_ = data_;
    this.next_ = next_;
  }

  public LinkedNode(LinkedNode<T> next_) {
    this.next_ = next_;
  }

  public LinkedNode(T data_) {
    this.data_ = data_;
  }

  public T getData_() {
    return data_;
  }

  public void setData_(T data_) {
    this.data_ = data_;
  }

  public LinkedNode<T> getNext_() {
    return next_;
  }

  public void setNext_(LinkedNode<T> next_) {
    this.next_ = next_;
  }

  // Provide String-representation for list beginning at `this` node.
  @Override

  public String toString() {


    String s = (null != data_ ? data_.toString() : "") + " " + (next_ != null ? next_.toString() : "");
    return s;

  }

  // You must provide a main() method!
  public static void main(String[] args) {

    LinkedNode<String> mon =new LinkedNode<String>("monday",null);
    LinkedNode<String> sat =new LinkedNode<>("saturday");
    LinkedNode<String> fri =new LinkedNode<>("friday",sat);
    LinkedNode<String> thu =new LinkedNode<>("thursday",fri);
    LinkedNode<String> wed =new LinkedNode<>("wednesday",thu);
    LinkedNode<String> tue =new LinkedNode<>("tuesday",wed);
    LinkedNode<String> sun =new LinkedNode<>("sunday",null);
    LinkedNode<String> feir=new LinkedNode<>(sat);
    sun.setNext_(mon);
    sat.setNext_(sun);

    System.out.println(thu.toString());
    System.out.println(tue.toString());
    System.out.println(tue.getData_());
    System.out.println(mon.getNext_());
    System.out.println(feir.getNext_());
    System.out.println(feir.getData_());
  }
}

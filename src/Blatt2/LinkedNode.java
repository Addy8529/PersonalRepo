package Blatt2;
//bearbeitung von Mohammad ahad (Gr. 5), Gurpreet Singh Chandi (Gr. 4) und Shashank Shorya(Gr. 5)

public class LinkedNode<T> {
    T data_;
    LinkedNode<T> next_;


    // TODO: constructors
    public  LinkedNode(T data_){
        this.data_=data_;
    }
    public LinkedNode(T data_, LinkedNode<T> next_) {       //Constructor
        this.data_ = data_;
        this.next_ = next_;
    }

    // TODO: getters and setters
    public T getData_() {                                   //getter for Data_
        return data_;
    }

    public void setData_(T data_) {                         //setter for Data_
        this.data_ = data_;
    }

    public LinkedNode<T> getNext_() {                       //getter for Next_
        return next_;
    }

    public void setNext_(LinkedNode<T> next_) {             //setter for next
        this.next_ = next_;
    }

    // Provide String-representation for list beginning at `this` node.
    @Override
    public String toString() {
        // TODO: show data_ from this to the end

        return (null != data_ ? data_.toString() : "") + " " + (next_ != null ? next_.toString() : "");
    }

    // You must provide a main() method!
    public static void main(String[] args) {
        // TODO: Test
        LinkedNode<String> fre = new LinkedNode<>("freitag", null);
        LinkedNode<String> don = new LinkedNode<>("Donnerstag", fre);
        LinkedNode<String> mit = new LinkedNode<>("Mittwoch", don);
        LinkedNode<String> die = new LinkedNode<>("Dienstag",mit );
        LinkedNode<String> mon = new LinkedNode<>("Montag", die );
        LinkedNode<String> sam =new LinkedNode<>("Samstag");
        LinkedNode<String> son =new LinkedNode<>("sonntag");
        sam.setNext_(son);
        son.setNext_(mon);




        System.out.println(sam.toString());

    }
}

package Blatt3;

//bearbeitung von Mohammad ahad (Gr 5), Gurpreet Sing Chandi (Gr. 4) und Shashank Shorya (Gr.5)

public class MyCircle<T> {
    //-----------------------------------------------------------------//
    //------------- !!Do not change the following lines!! -------------//
    //A Node is a single element int the ring
    class Node {
        T data_ = null;
        Node next_ = null;
        Node prev_ = null;

        Node(T obj, Node prv, Node nxt) {
            data_ = obj;
            prev_ = prv;
            next_ = nxt;
        }
    }

    //--- class members
    protected Node head_ = null;

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
        // TODO: return the size of the ring buffer
        Node curr = head_; //creating a new node
        if(this.empty()){ //when the list is empty
            return 0;
        }else{
            int size_ = 1; // when the list will not be empty that mean the list atleast has a head (one node)
            Node temp = head_.next_;
            while(temp != head_){  // traverse to the last node
                temp = temp.next_;
                size_++;
            }
            return size_;
        }
    }

    //-----------------------------------------------------------------//
    public boolean empty() {
        // TODO: return if the ring buffer is empty
        if(head_ != null)
            return false;
        return true;
    }

    //-----------------------------------------------------------------//
    public void push_back(T obj) {
        // TODO: append an element at the 'end' of the end buffer
        if(this.empty()){
            Node newNode = new Node(obj, null, null); //created a new node
            head_ = newNode;
            head_.next_ = head_;
            head_.prev_ = head_;
        }else{
            Node new_node =new Node (obj, head_.prev_, head_);
            Node tempLast = head_.prev_;  // tempLast <- head_ temporarily saving the last element of the list
            tempLast.next_ = new_node; // tempLast -> new_node
            head_.prev_ = new_node; // new_node <- head_
        }
    }

    //-----------------------------------------------------------------//
    public void pop_front() {
        // TODO: remove an element at the 'front' if the ring buffer
        if(this.size() == 0){
            System.out.println("invalid command");
        }else if(this.size() == 1){
            head_ = null;
        }else{
            Node temp1 = head_.prev_; //temp1 <- head-
            Node temp2 = head_.next_; //head_ -> temp2
            head_ = temp2;  // temp 2 is the new head
            temp2.prev_ = temp1;  // temp1 -> temp2
            temp1.next_ = temp2; // temp1 <- temp2
        }
    }

    //-----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples
        MyCircle<Integer> cLink_list = new MyCircle<>();
        cLink_list.push_back(2);
        System.out.println("Size: " + cLink_list.size());
        System.out.println("isEmpty:" + cLink_list.empty());
        cLink_list.push_back(1);
        System.out.println("List" + cLink_list.toString());
        cLink_list.pop_front();//poping the first element
        System.out.println("List:" + cLink_list.toString());
        System.out.println("Size: " + cLink_list.size());
        cLink_list.pop_front();
        cLink_list.pop_front();
        System.out.println("List: " + cLink_list.toString());
        System.out.println("isEmpty:" + cLink_list.empty());
        cLink_list.push_back(3);
        cLink_list.push_back(5);
        cLink_list.push_back(7);
        System.out.println("List: " + cLink_list.toString());
        System.out.println("Size: " + cLink_list.size());

    }
}
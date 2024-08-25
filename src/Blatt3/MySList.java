package Blatt3;

// Code done by Muhammad ahad  (gr. 5 ) , Gurpreet singh Chandi (gr. 4) , Shashank Shorya (gr. 5)

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
        } while (node != null);
        rv += "]";
        return rv;
    }

    //-----------------------------------------------------------------//
    //---------------- !!Insert your solution below!! -----------------//

    /**
     * Node represents a single element in the list.
     */
    class Node {
                                 //!! Do not change this line !!
        // TODO: further implementation of `Node`

        int data_;
        Node next_;

        public Node(int data_, Node next_) {
            this.data_ = data_ ;
            this.next_ = next_ ;
        }
    }

    //----------------------------------------------------------------//
    Node head_;

    //----------------------------------------------------------------//
    public MySList() {
        // TODO: Constructor
        head_ = null;

    }
    public boolean empty() {
      return head_ == null; // if head is null means list is empty

    }

    //----------------------------------------------------------------//
    // TODO: implement (at least) a function to insert an element
    //       into MySList

    public void push_back(int i ) {

        // creating a method to add an object at the end
        if (!empty()) {
            Node n = head_;
            while (n.next_ != null)
                n = n.next_;
            n.next_ = new Node(i, null);

        } else {
            head_ = new Node(i, null);

        }
    }



        //----------------------------------------------------------------//
        /**Iterator is used to traverse odd elements in a list.*/
        public class Iterator implements java.util.Iterator<Integer> {
            // TODO: implement the Iterator, which walks over odd elements
            Node node_;

            public Iterator(Node node) { // creating an Iterator
                node_ = node;
                if (!(Math.abs(node.data_ % 2) == 1)){ // if node is even
                    node_ = Odd(node_); // setting the node odd
                }

            }

            @Override
            public boolean hasNext() { // it will check wheather the next element exists or not

                return node_ != null;
            }

           @Override
           public Integer next() {       // it returns the next element
               if (hasNext()) {         // if the next element exists
                   Integer data = node_.data_;
                   node_ = Odd(node_);
                   return data;         // returning the data
               }else {
                   return null;
               }
            }

         // creating a new function for odd nodes
            private Node Odd(Node n){

                while ((n = n.next_) != null) { // as long as node next not equals to null
                    if ((Math.abs(n.data_ % 2) == 1)) // if the element is odd
                        return n;
                }
                return null;
            }

        }
        //----------------------------------------------------------------//
       public Iterator iterator () {
        // TODO: implement this method, which returns a new iterator instance

           return new Iterator(head_); // creating an Iterator starting at head_

    }

    //----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples
        int[] l = { 85, 72, 93, 81, 74, 42 };
        MySList list = new MySList();

        for (Integer i : l) {
            list.push_back(i);
        }
        System.out.println(list);

        for (int el : list) {
            System.out.println(el);
        }
        for (int j=0;j<3;j++){
            System.out.println(list);
        }

        }

    }


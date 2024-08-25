package Blatt6;

//zusammenarbeit von Shashank Shorya, Gurpreet Singh Chandi und Muhammad Ahad.

//-----------------------------------------------------------------//
public class SimpleTree<T extends Comparable<T>> {
    //---------------------------------------------------------------//
    public class Node {
        // TODO: implement node class
        T data;
        Node left;
        Node right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }



    }

    //---------------------------------------------------------------//
    private Node root_;

    //---------------------------------------------------------------//
    public SimpleTree() {
        // TODO: implementation
        root_ = null;

    }

    //---------------------------------------------------------------//
    public void add(T obj) {
        // TODO: implementation
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
        // TODO: implementation
        Node node = root_;
        while (node != null) {
            if (obj.compareTo(node.data) < 0) {
                node = node.left;
            } else if (obj.compareTo(node.data) > 0) {
                node = node.right;
            } else {
                return true;
            }
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
        // TODO: test your code with appropriate examples
        SimpleTree<Integer> tree = new SimpleTree<Integer>();
        tree.add(4);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(10);
        tree.add(12);
        tree.add(7);
        System.out.println("tree inorder: " + tree.toString());
        System.out.println(tree.contains(4));
        System.out.println(tree.contains(7));
        System.out.println(tree.contains(11));
    }
}
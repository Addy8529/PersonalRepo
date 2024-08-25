package Blatt8;

import java.util.ArrayList;
import java.util.Collections;

// gruppearbeit von Muhammad Ahad (Gr.5), Gurpreet Singh Chandi(Gr.4) und Shashank Shorya(Gr. 5)

public class MaxHeap<T extends Comparable<T>> {
    //-----------------------------------------------------------------//
    //------------- !!Do not change the following lines!! -------------//
    public String toString() {
        return heap_.toString();  // don't change because of backend
    }

    //---------------------------------------------------------------//
    //--------------- !!Insert your solution below!! ----------------//
    private final ArrayList<T> heap_;  // or Vector

    //---------------------------------------------------------------//

    public MaxHeap() {
        // TODO: implementation
        heap_ = new ArrayList<>();
    }

    //---------------------------------------------------------------//
    public MaxHeap(T[] arr) {
        // TODO: construct a heap from array a (use downHeap)
        heap_ = new ArrayList<>();
        Collections.addAll(heap_, arr);
        int r  = (getSize()-1)/2;
        while (r >= 0) {
            downHeap(r);
            r--;
        }
    }

    //---------------------------------------------------------------//
    public int getSize() {
        // TODO: implementation
        return heap_.size();
    }

    //---------------------------------------------------------------//
    public boolean isEmpty() {
        // TODO: implementation
        return heap_.isEmpty();
    }

    //---------------------------------------------------------------//
    public void downHeap(int n) {
        // TODO: implementation
        T x = heap_.get(n);

        while (n <= (getSize()-1) / 2) {
            int left = (2*n) + 1;
            int right =((2*n)+ 1) + 1;

            if (left < getSize()-1 && heap_.get(left).compareTo(heap_.get(right)) < 0) {
                if (x.compareTo(heap_.get(right)) > 0) {
                    break;
                }
                Collections.swap(heap_, n, right); // swaping the element and updating the n
                n = right;

            }else {
                if (x.compareTo(heap_.get(left)) >= 0) { // compare the added element with left element and greater than 0
                    break;
                }
                Collections.swap(heap_, n, left);// swap the element and update the n
                n = left;
            }
        }
    }

    //---------------------------------------------------------------//
    public void insert(T obj) {
        // TODO: implementation, use upHeap
        heap_.add(obj);
        upHeap(heap_.size() - 1);
    }

    //---------------------------------------------------------------//
    private void upHeap(int n) {
        // TODO: implementation
        T x = heap_.get(n);

        while (n > 0 && x.compareTo(heap_.get((n-1)/2))>0) {
            Collections.swap(heap_,(n-1)/2, n);
            n=(n-1)/2;
        }
    }


    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples
        Character[] list = {'X', 'T', 'O', 'G', 'S', 'M', 'N', 'A', 'E', 'R', 'A', 'I'};
        MaxHeap<Character> maxheap = new MaxHeap<>(list);

        System.out.println("List:");
        System.out.println(maxheap);
        System.out.println();
        System.out.println("Insert Z :");
        maxheap.insert('Z');
        System.out.println(maxheap);
        System.out.println();
        System.out.println("Insert J :");
        maxheap.insert('J');
        System.out.println(maxheap);
    }
}
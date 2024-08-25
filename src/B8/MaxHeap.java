package B8;
//zusammenarbeit von Shashank Shorya, Gurpreet Singh Chandi und Muhammad Ahad.

import java.util.*;

//-----------------------------------------------------------------//
public class MaxHeap<T extends Comparable<T>> {
    //-----------------------------------------------------------------//
    //------------- !!Do not change the following lines!! -------------//
    public String toString() {
        return heap_.toString();  // don't change because of backend
    }

    //---------------------------------------------------------------//
    //--------------- !!Insert your solution below!! ----------------//
    private ArrayList<T> heap_;

    //---------------------------------------------------------------//
    public MaxHeap() {
        // Initialize an empty heap
        heap_ = new ArrayList<>();
    }

    //---------------------------------------------------------------//
    public MaxHeap(T[] arr) {
        // Construct a heap from the given array using downHeap
        heap_ = new ArrayList<>(Arrays.asList(arr));
        for (int i = (heap_.size() - 2) / 2; i >= 0; i--) {
            downHeap(i);
        }
    }

    //---------------------------------------------------------------//
    public ArrayList<T> getHeap() {
        return heap_;
    }

    //---------------------------------------------------------------//
    public int getSize() {
        return heap_.size();
    }

    //---------------------------------------------------------------//
    public boolean isEmpty() {
        return heap_.isEmpty();
    }

    //---------------------------------------------------------------//
    public void downHeap(int n) {
        int parentIdx = n;
        while (true) {
            int leftChildIdx = 2 * parentIdx + 1;
            int rightChildIdx = 2 * parentIdx + 2;
            int largestIdx = parentIdx;

            if (leftChildIdx < heap_.size() && heap_.get(leftChildIdx).compareTo(heap_.get(largestIdx)) > 0) {
                largestIdx = leftChildIdx;
            }

            if (rightChildIdx < heap_.size() && heap_.get(rightChildIdx).compareTo(heap_.get(largestIdx)) > 0) {
                largestIdx = rightChildIdx;
            }

            if (largestIdx != parentIdx) {
                swap(parentIdx, largestIdx);
                parentIdx = largestIdx;
            } else {
                break;
            }
        }
    }

    //---------------------------------------------------------------//
    public void insert(T obj) {
        heap_.add(obj);
        upHeap(heap_.size() - 1);
    }

    //---------------------------------------------------------------//
    private void upHeap(int n) {
        int childIdx = n;
        while (childIdx > 0) {
            int parentIdx = (childIdx - 1) / 2;
            if (heap_.get(childIdx).compareTo(heap_.get(parentIdx)) > 0) {
                swap(childIdx, parentIdx);
                childIdx = parentIdx;
            } else {
                break;
            }
        }
    }

    //---------------------------------------------------------------//
    private void swap(int i, int j) {
        T temp = heap_.get(i);
        heap_.set(i, heap_.get(j));
        heap_.set(j, temp);
    }

    //---------------------------------------------------------------//
    public static void main(String[] args) {
        Character[] arr = {'X', 'T', 'O', 'G', 'S', 'M', 'N', 'A', 'E', 'R', 'A', 'I'};
        MaxHeap<Character> maxHeap = new MaxHeap<>(arr);

        System.out.println("Heap: " + maxHeap.getHeap());
        System.out.println("Size: " + maxHeap.getSize());
        System.out.println("Is Empty: " + maxHeap.isEmpty());

        maxHeap.insert('Z');
        System.out.println("Heap after insert: " + maxHeap.getHeap());
    }
}

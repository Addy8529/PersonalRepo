package Blatt12;

import java.util.Stack;
public class StackSort implements Comparable<StackSort> {
    private Object object;

    public StackSort(Object object) {
        this.object = object;
    }

    public static <T extends Comparable<? super T>> boolean isSorted(Stack<T> invoices) {
        if (invoices.isEmpty() || invoices.size() == 1) {
            return true;
        }

        Stack<T> tempStack = new Stack<>();
        T current = invoices.pop();

        while (!invoices.isEmpty()) {
            T next = invoices.pop();

            if (current.compareTo(next) > 0) {
                return false;
            }

            tempStack.push(current);
            current = next;
        }

        while (!tempStack.isEmpty()) {
            invoices.push(tempStack.pop());
        }

        return true;
    }

    @Override
    public int compareTo(StackSort other) {
        // Modify this method based on the comparison logic for your objects
        // Here's an example assuming the objects are integers
        Integer thisValue = (Integer) this.object;
        Integer otherValue = (Integer) other.object;
        return thisValue.compareTo(otherValue);
    }

    public static void main(String[] args) {
      
    }
}

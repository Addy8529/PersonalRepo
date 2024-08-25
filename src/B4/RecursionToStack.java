package B4;

import aud.Stack;

public class RecursionToStack {
  //-----------------------------------------------------------------//
  public static int whatStack(int n) {
    // TODO:
    Stack<Integer> stack = new Stack<>();


    if (n < 10) return n;

    while (n >= 10) {
      stack.push(n % 10);
      n /= 10;
    }
    int sum = n;
    while (!stack.is_empty()) {
      sum += stack.pop();
    }


    return sum;
  }



  //-----------------------------------------------------------------//
  public static void main(String[] args) {
    int[] list ={1,5,10,20,23,28,31,44};

    for(int i:list){
      System.out.print("The Sum of Digits of "+i);
      System.out.println(" ="+whatStack(i));
    }


  }
}
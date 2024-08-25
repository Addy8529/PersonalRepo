package Blatt4;

import aud.Stack;
import java.util.Scanner;

//Work from Muhammad Ahad (Gr. 5), Gurpreet Singh Chandi (Gr. 4) and Shashank Shorya(Gr. 5)

public class RecursionToStack {
    //-----------------------------------------------------------------//
    public static int whatStack(int n) {
        // TODO: implement the function `whatRec` with a stack
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        if(n<10){
            sum = n;
        }else{
            while (n != 0){
                int rem = n % 10; // 1234 -> 4, 123 -> 3, 12 -> 2, 1
                n /= 10;          // 1234 -> 123 -> 12 -> 1
                stack.push(rem);
            }
            while(!stack.is_empty())
                sum += stack.pop();
        }
        return sum;
    }

    //-----------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("sum: " + whatStack(n));
    }
}

package Blatt2;

import aud.Stack;

// Code done by Muhammad ahad  (gr. 5 ) , Gurpreet singh Chandi (gr. 4) , Shashank Shorya (gr. 5)

public class TPalindrome {

    public static boolean isTPalindrome(String text) {
        Stack<Character> stack = new Stack<>(); // created stack
        String string1 = new String();        // created a string

        char[] a = text.toCharArray();         // created a char array and copied text into it
        int i = 0 ;

        // all characters into the stack  till the ')'
        while (i < a.length) {
            if (a[i] != ')') {
                stack.push(a[i]); // push all elements in stack untill we reach ")"
            } else {//
                String string2 = new String();

                // deleting everything from brackets  and saving in string
                while (stack.top() != '(') {
                    string2 += (stack.pop());
                }
                stack.pop();
                if (!isPalindrome((string2))) {
                    return false;
                } else {
                    stack.push('*');  // here we are replacing the Palindrome in Brackets with *
                }

            }

            i++;

        }

        // pop the Characters one by one till the stack is empty
        while (!stack.is_empty()) {
            string1 += (stack.pop());

        }

        return isPalindrome((string1));
    }


    public static boolean isPalindrome(String text) {
        Stack<Object> stack = new Stack<>();
        String reverse = new String();
        text = text.toLowerCase();


        for (int i = 0; i < text.length(); i++) {  // pushing the Character one by one onto the  Blatt1.Stack
            stack.push(text.charAt(i));
        }

        while (!stack.is_empty()) { // pop the Characters one by one till the stack is empty
            reverse += (stack.pop());

        }

        return text.equals(reverse); // here we are comparing the characters

    }


    public static void main(String[] args) {
        String t1 = "al(otto)la";
        String t2 = "abc(aha)(u)cba";
        String t3 = "abc(ah(otto)v(atta)ha)cba";
        String t4 = "a(b)cca(b)";
        String t5 = "abc(ah(otto)h)cba";


        System.out.println( t1  + " is a Blatt2.TPalindrome " + " : " + isTPalindrome(t1));
        System.out.println( t2  + " is a Blatt2.TPalindrome " + " : " + isTPalindrome(t2));
        System.out.println( t3  + " is a Blatt2.TPalindrome " + " : " + isTPalindrome(t3));
        System.out.println( t4  + " is a Blatt2.TPalindrome " + " : " + isTPalindrome(t4));
        System.out.println( t5  + " is a Blatt2.TPalindrome " + " : " + isTPalindrome(t5));

    }

}
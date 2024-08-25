package B2;

import aud.Stack;

public class TPalindrome {
  // Test if text is a T-palindrome.
  // The input is guaranteed to include only valid characters, i.e.,
  // those in {'a',...,'z','(',')','*'}. You don't need to check this.
  //

  public static boolean isTPalindrome(String text) {

    Stack<Character> stack =new Stack<>();
    String subString1 ;
    String subString2 =new String();
    int pointer =0;
    // loop through the whole String
    while(pointer< text.length()){


      if(text.charAt(pointer)!=')'){
        //pushes charachters into stack untill ')'
        stack.push(text.charAt(pointer));
      }else {
        // makes a substring
        subString1 =new String();
        while(stack.top()!='('){
          subString1 +=stack.pop();
        }
        stack.pop();
        //if substring is palindrome , goes further
        if(isPalindrome(subString1)){
          stack.push('*');
        }else return false;
      }
      pointer++;
    }
    while(!stack.is_empty()){
      subString2 +=stack.pop();
    }

    if(isPalindrome(subString2))return true;

    return false;
  }
  public static boolean isPalindrome(String text) {
    Stack<Character> stack =new Stack<>();
    char charachters[] =text.toLowerCase().toCharArray();

    // pushing text into stack
    for(int i=0;i<charachters.length;i++){
      stack.push(charachters[i]);
    }

    // poping stack
    int  i=0;
    while(!stack.is_empty()){

      if(stack.pop()==charachters[i]){
        i++;
      }else {
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    String strings[] ={"al(otto)la","abc(aha)(u)cba","abc(ah(otto)v(atta)ha)cba","abc","a(b)cca(b)","abc(ah(otto)h)cba"};

  for(int i=0;i<strings.length;i++){
    System.out.println(strings[i]+" is a T-Palindrome : "+isTPalindrome(strings[i]));
  }
  }
}

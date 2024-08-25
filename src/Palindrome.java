import java.util.Stack;

public class Palindrome {
  // Test if text is a palindrome.
  // Ignore upper/lower case, white space, and punctuation.
  //
  public static boolean isPalindrome(String text) {
    text=text.toLowerCase();        // convert all to lower case
   text=text.replaceAll("[^a-zA-Z]","");  // remove any special charachters

    int count=0; // intiate counter


    Stack stackAscend=new Stack();    // created two stacks one ascinding and the  other descending
    Stack stackDescend=new Stack();

   for(int i=0;i<text.length();i++){          // copied text into stack
   stackAscend.push(text.charAt(i));
   }
    for(int j=text.length()-1;j>=0;j--){
      stackDescend.push(text.charAt(j));
    }

for(int i=0;i<=text.length()-1;i++){   // test for palindrome
  if(stackAscend.toString().charAt(i)==stackDescend.toString().charAt(i))count++;else return false;
}

if (count<text.length())return false;
else return true;




  }

  public static void main(String[] args) {

    System.out.println(isPalindrome("amadama" ));
  }
}

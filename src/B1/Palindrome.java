package B1;

public class Palindrome {
  // Test if text is a palindrome.
  // Ignore upper/lower case, white space, and punctuation.
  //
  public static boolean isPalindrome(String text) {
    Stack<Character> stack =new Stack<>();
    char charachters[] =text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

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
    String texts[] ={"Reliefpfeiler","Lagerregal","Ein Esel lese nie.","Na, Fakir, Paprika-Fan?","Eine Horde bedrohe nie!",
            "Madam","Marktkram","Gurken hol ohne Krug!","O, Streit irritiert so!"};
    for(int i=0;i< texts.length;i++){
      String result =(isPalindrome(texts[i])) ?" is a " : "is not a";
      System.out.println(texts[i] +" "+result+" Palindrome. ");
    }
  }
}

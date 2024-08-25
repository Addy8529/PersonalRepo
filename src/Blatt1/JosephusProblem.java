package Blatt1;

public class JosephusProblem {

  // Solve the Josephus problem for a list of persons and a number k
  // of persons to be skipped. The solution should "simulate" the
  // counting-out and return a queue that contains all persons in the
  // order they were counted out.
  //
  public static Queue solve(String[] persons, int k) {
    Blatt1.Queue Q =new Blatt1.Queue();
    int counter =0;
    int terminator = persons.length-k;
    // enque
    int i=0;
    while (i< persons.length){
      Q.enqueue(persons[i]);
    }

     while(terminator>0){
       if(counter==k){
         Q.dequeue();
         counter=0;
         terminator--;
       }else{
         Q.enqueue(Q.dequeue());
         counter++;
         terminator--;
       }


     }
     return Q;
  }

  public static void main(String[] args) {
    String[] s ={"a","b","c","d"};
    System.out.println(solve(s,2));
  }
}

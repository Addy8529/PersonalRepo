package Blatt1;

public class TailRecursion {
  // Compute power 2^n recursively.
  //
  // The computation must use _tail recursion_!
  // Note: This requires the implementation of a tail recursive
  //       auxiliary method that is called by pow2()!)
  //
  public static int pow2(int n) {
    int P=1;
    return _pow2(n,1);
  }
public static int _pow2(int n,int P){
    if(n==0) return P;
    else return _pow2(n-1,P*2);
}

  // Compute the sum of factors (divisors) of n
  // The factors include 1 but exclude n, e.g., sumFactors(6) ==
  // 1+2+3 == 6 .
  //
  // The computation must use _tail recursion_!
  //
  public static int sumFactors(int n) {
      int sum=1;
    assert n>0 :"Null ist durch alle nummern dividierbar";
   for(int i=2;i<=n/2;i++){
       if(n%i==0){
           sum+=i;

       }
   }


   return sum;
  }



  // Test your implementation.
  //
  public static void main(String[] args) {

    System.out.println(pow2(6));
    System.out.println(sumFactors(12));
  }
}

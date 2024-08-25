package B1;
public class TailRecursion {

  // Compute power 2^n recursively.
  //
  // The computation must use _tail recursion_!
  // Note: This requires the implementation of a tail recursive
  //       auxiliary method that is called by pow2()!)
  //
  public static int pow2(int n) {
    return _pow2(n, 2);
  }

  public static int _pow2(int n, int returnValue) {
    if (n == 0) {
      return 1;
    } else if (n == 1) {
      return returnValue;
    } else {
      return _pow2(n - 1, 2 * returnValue);
    }
  }


  // Compute the sum of factors (divisors) of n
  // The factors include 1 but exclude n, e.g., sumFactors(6) ==
  // 1+2+3 == 6 .
  //
  // The computation must use _tail recursion_!
  //
  public static int sumFactors(int n) {
        return _sumFactors(n,0,1);
  }
  public static int _sumFactors(int n, int Sum,int factor){
     //
      if(factor>=(n-n/2)+1){

        return Sum;

      } else {
        int newSum = n % factor == 0 ? Sum + factor : Sum;
        int newFactor = factor + 1;
        return _sumFactors(n, newSum, newFactor);
      }

  }


  public static void main(String[] args) {

    for(int i=0;i<=10;i++){
      int m = pow2(i);
      int sum =sumFactors(i);

      System.out.println("2^"+i+"= "+m);
      System.out.println("Sum of factors of "+i+"= "+sum);

    }
  }
}
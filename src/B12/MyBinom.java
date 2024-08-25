package B12;

//-----------------------------------------------------------------//
public class MyBinom {
  //---------------------------------------------------------------//
  static int rec=0;
  static int dp=0;
  public static int binom(int n, int k) {

    int[][] array= new int[n+1][k+1];
    int aufwand=0;
    for(int i=0;i<=n;i++){
      for(int j=0;j<=Math.min(i,k);j++){
        if( j==0 || j==i ){
          array[i][j]=1;
          dp++;
        }else {
          array[i][j]=array[i-1][j-1]+array[i-1][j];
          dp++;
        }
      }
    }

    return array[n][k];
  }
  public static int RecBinom(int n , int k){

    if( n==k || k==0){
      rec++;
      return 1;

    }else {
      rec++;
      return RecBinom(n-1,k)+RecBinom(n-1,k-1);
    }
  }
  //---------------------------------------------------------------//
  public static void main(String[] args) {

    int n=7;
    int k=5;
    System.out.println("Binomialkoeffizient fur n= "+n+" und k= "+ k+" ist "+binom(n,k));
    System.out.println("DP AUFWAND "+dp);
    System.out.println("Binomialkoeffizient mit Recursion fur n= "+n+" und k= "+ k+" ist "+RecBinom(n,k));
    System.out.println("Recursion Aufwand :" +rec);
  }
}

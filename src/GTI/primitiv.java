package GTI;

public class primitiv {
    public static int function(int n){
        if(n==0){return 0;
        }else {
            return 2*function(n-1)+2;
        }
    }
    public static int f(int n){
        return (int) (Math.pow(2,n+1)-2);
    }

    public static int myApproach(int n) {
        if(n==0){
        return 0;
        }else return 2+(myApproach(n-1)*2);
    }
    public static int factorial(int n){
        if(n==0){
            return n+1;
        }else return n*factorial(n-1);
    }
    public static int nChoose2(int n){
        return (factorial(n)/((factorial(2))*(factorial(n-2))));
    }
    public static void main(String[] args) {
        System.out.println(function(4));
        System.out.println(f(4));
        System.out.println(myApproach(4));
        System.out.println("factorial of 4:"+factorial(4));
        System.out.println("nchoose2 :"+nChoose2(4));
    }
}

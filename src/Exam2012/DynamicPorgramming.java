package Exam2012;

public class DynamicPorgramming {
    static int a(int n) { return n==0 ? 1 : n*a(n-1); }
    static int a_(int n){
        int x=0;
        if(n==0){
            x=1;
        }else {
            while(n>0){
                x=n*(x);
                n--;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("a="+a(i));
            System.out.println(a_(i));
        }


    }
}

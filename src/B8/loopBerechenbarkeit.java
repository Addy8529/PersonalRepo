package B8;

public class loopBerechenbarkeit {
    public  static int pow(int x, int y){
       int x_o=0;


       while(y>0){
           int x2=x;
           while(x2>0){
               int x3=x;
               while(x3>0){
                   x_o=x_o+1;
                   x3--;
               }

               x2--;
           }

           y--;
       }

        return x_o;
    }
    public static void main(String[] args) {
        int x=0;
        int y=0;
        System.out.println(pow(x,y));

    }
}

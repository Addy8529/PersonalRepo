package Blatt11;

public class Array {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        a[1][2]=12;
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.println(a[i][j]);
           }
       }
    }
}

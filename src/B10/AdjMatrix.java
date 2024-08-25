package B10;
import java.util.*;

//---------------------------------------------------------------//
public class AdjMatrix{
  //-------------------------------------------------------------//
  public  static int inDegree(int k, int[][] m){
    int degree=0;
    for(int i=0;i<m.length;i++){
      if(m[i][k]==1) degree++;
    }
    return degree;
  }

  //-------------------------------------------------------------//
  public  static int outDegree(int k, int[][] m){
    int degree=0;
    for(int i=0;i<m.length;i++){
      if(m[k][i]==1) degree++;
    }
    return degree;
  }

  //-------------------------------------------------------------//
  public  static List<Integer> adjacent(int k, int[][] m){
    //TODO: implement
    List<Integer> list_in=new LinkedList<>();
    List<Integer> list_out=new LinkedList<>();
    List<Integer> list=new LinkedList<>();

    for(int i =0;i< m.length;i++){
      if(m[k][i]==1){
        list_out.add(i);
      }
      if(m[i][k]==1){
        list_in.add(i);
      }
    }
   for(int i=0;i<m.length;i++){
     if(list_in.contains(i)||list_out.contains(i))list.add(i);
   }

    return list;
  }

  //-------------------------------------------------------------//
  public static boolean hasTriangle(int[][] m) {

    for (int i = 0; i < m.length; i++)
      for (int j = 0; j < m.length; j++)
        for (int k = 0; k < m.length; k++)
          if (m[i][j] == 1 && m[j][k] == 1 && m[k][i] == 1)
            return true;
    return false;
  }


  //-------------------------------------------------------------//
  public static void main(String args[]) {

    int[][] array={{0,1,1,1,1},{1,0,0,1,1},{1,0,0,1,0},{1,1,1,0,1},{1,1,0,1,0}};
    System.out.println("adjacent list :"+adjacent(0,array));
    System.out.println("outDegree :"+outDegree(0,array));
    System.out.println("In Degree :"+inDegree(0,array));
    System.out.println("Has Triangle 1:"+hasTriangle(array));
  }
}

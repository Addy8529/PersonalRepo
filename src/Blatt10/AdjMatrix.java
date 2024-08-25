package Blatt10;
//bearbeitung von Mohammad ahad (Gr 5), Gurpreet Sing Chandi (Gr. 4) und Shashank Shorya (Gr.5)
import java.util.*;

//---------------------------------------------------------------//
public class AdjMatrix {
    //-------------------------------------------------------------//
    public static int inDegree(int k, int[][] m) {
        //TODO: implement
        int countIn = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i][k] == 1)
                countIn++;
        }
        return countIn;
    }

    //-------------------------------------------------------------//
    public static int outDegree(int k, int[][] m) {
        //TODO: implement
        int countOut = 0;
        for (int i = 0; i < m[k].length; i++) {
            if (m[k][i] == 1)
                countOut++;
        }
        return countOut;
    }

    //-------------------------------------------------------------//
    public static List<Integer> adjacent(int k, int[][] m) {
        //TODO: implement
        ArrayList<Integer> listAdjNode = new ArrayList<>();
        for (int i = 0; i < m.length; i++) {
            if (m[k][i] == 1)
                listAdjNode.add(i);
        }
        return listAdjNode;
    }

    //-------------------------------------------------------------//
    public static boolean hasTriangle(int[][] m) {
        //TODO: implement
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m.length; j++)
                for (int k = 0; k < m.length; k++)
                    if (m[i][j] == 1 && m[j][k] == 1 && m[k][i] == 1)
                        return true;
                    return false;
    }

    //-------------------------------------------------------------//
    public static void main(String args[]) {
        //TODO: test your code
        int[][] matrix_A = new int[][]{ {0, 1, 0, 0, 1}, {0, 0, 0, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 0} };
        for (int i = 0; i < matrix_A.length; i++) {
            System.out.println("Node: " + i);
            System.out.println("inDegree: " + inDegree(i, matrix_A));
            System.out.println("outDegree: " + outDegree(i, matrix_A));
            System.out.println("adjacent: " + adjacent(i, matrix_A));
        }
        System.out.println(hasTriangle(matrix_A));
    }
}

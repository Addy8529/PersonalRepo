//bearbeitung von Mohammad ahad, Gurpreet Sing Chandi und Shashank Shorya

Darstellung von Graphen
---

**TODO:** Insert your answer for task 1, 3 and 4!
1.) Was ist ein Graph? Erläutere die unterschiedlichen Arten von Graphen.

=> Ein Graph G besteht aus einer Menge von Knoten V und einer Menge von Kanten E. Die Knoten werden mit Kanten verbunden, wobei eine Kante immer genau zwei Knoten miteinander 	verbindet.

   Gerichtete Graph:- Graphen, bei denen die Kanten eine Richtung haben, werden als gerichtete Graphen oder Bigraphen bezeichnet.
   Ungerichtete Graph:- Graphen, in denen Knoten mit einer richtungslosen Kante verbunden sind, auf der wir in beide Richtungen navigieren können.
   Gewichteter Graph:- Graphen, in denen Kanten Gewicht haben.	

2.)	
	    2 ----------
	 /    \			|
	1 ---- 5	    |
	| \  /			|
	|   4 ----------|
	|  /
	 3


3.) Notiere für diesen Graphen
=>
		die Kantenliste => E = {(1,2), (1, 3), (1, 4), (1, 5), (2, 4), (2, 5), (3, 4), (4, 5)} 
		IN_JAVA => int[] kantenliste = {5,8,1,2,1,3,1,4,1,5,2,4,2,5,3,4,4,5};
		5 = # der knoten & 8 = # der kanten

		die Knotenliste => {1, 2, 3, 4, 5}
	   	IN_JAVA => int[] knotenliste = { 5,8, 4,2,3,4,5,  3,1,4,5,  2,1,4,  4,1,2,3,5,  3,1,2,4 };
		5 = # der knoten & 8 = # der kanten

		die Adjazenzmatrix => 
		Adjazenzmatrix [2D-Array]

   		   1 2 3 4 5

		1  0 1 1 1 1
		2  1 0 0 1 1
		3  1 0 0 1 0
		4  1 1 1 0 1
		5  1 1 0 1 0
		
		
		IN_JAVA => int[][] adjazenzmatrix = {{0,1,1,1,1},{1,0,0,1,1},{1,0,0,1,0},{1,1,1,0,1},{1,1,0,1,0}};


		die Adjazenzliste => 
		
		1 ---> 2,3,4,5
		|
		2 ---> 1,4,5
		|
		3 ---> 1,4
		|
		4 ---> 1,2,3,5
		|
		5 ---> 1,2,4



    Wie lauten die entsprechenden Datenstrukturen in Java?

4.) Gib die Algorithmen (in Java) an, die die Überführung

=> einer Kantenliste in eine Adjazenzmatrix,
	

public class EdgelistToAdjazenzmatrix {

    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5; 
        int a,b ;

        int[] edge_a = {0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4}; 
        int[] edge_b = {1, 3, 4, 0, 2, 3, 4, 1, 3, 0, 1, 2, 4, 0, 1, 3}; 

        int[][] adjazenzmatrix = new int[n][n]; 

        for(int i=0; i<edge_a.length; i++){
            a = edge_a[i]; b = edge_b[i];

            adjazenzmatrix[a][b] = 1;
        }
        System.out.println("Adjazenzmatrix");
        printMatrix(adjazenzmatrix);
    }
}


=> eine Kantenliste in eine Adjazenzliste

import java.util.ArrayList;

public class EdgelistToAdjazenzliste {

    public static void printAdjList(ArrayList<ArrayList<Integer>> adjazenzListe){
        int n = adjazenzListe.size();
        for(int i=0; i<n; i++){
            System.out.println(i + "-->" + adjazenzListe.get(i));
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[] edge_a = {0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4};
        int[] edge_b = {1, 3, 4, 0, 2, 3, 4, 1, 3, 0, 1, 2, 4, 0, 1, 3};

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++) adjList.add(new ArrayList<Integer>());

        for(int i=0; i<edge_a.length; i++){
            int a = edge_a[i]; int b = edge_b[i];
            adjList.get(a).add(b);
        }
        System.out.println("Adjazenzliste");
        printAdjList(adjList);

    }
}
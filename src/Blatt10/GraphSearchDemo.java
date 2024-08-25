package Übung.B10;
// Gruppenarbeit von Muhammad Ahad , Shashank Shorya und Gurpreet Singh Chandi
import aud.example.graph.*;
import aud.util.DotViewer;
import aud.util.SingleStepper;


//------------------------------------------------------------------//
public class GraphSearchDemo {

  //----------------------------------------------------------------//  
  public static MyGraph createGraph() {
    //TODO: implement
    MyGraph graph = new MyGraph(false);
    return graph;
  }

  //----------------------------------------------------------------//
  public static void main(String args[]) {
    //TODO: implement
    MyGraph testGraph = createGraph();
    MyNode[] nodes = new MyNode[8];
    for (int i = 0; i < 8; i++ ){
      nodes[i] = testGraph.addNode();
    }
    nodes[0].setLabel("1");
    nodes[1].setLabel("2");
    nodes[2].setLabel("3");
    nodes[3].setLabel("4");
    nodes[4].setLabel("5");
    nodes[5].setLabel("6");
    nodes[6].setLabel("7");
    nodes[7].setLabel("8");



    testGraph.addEdge(nodes[0], nodes[1]);
    testGraph.addEdge(nodes[0], nodes[2]);
    testGraph.addEdge(nodes[0], nodes[7]);
    testGraph.addEdge(nodes[0], nodes[6]);
    testGraph.addEdge(nodes[0], nodes[5]);
    testGraph.addEdge(nodes[1], nodes[7]);
    testGraph.addEdge(nodes[2], nodes[7]);
    testGraph.addEdge(nodes[3], nodes[4]);
    testGraph.addEdge(nodes[3], nodes[5]);
    testGraph.addEdge(nodes[4], nodes[5]);
    testGraph.addEdge(nodes[4], nodes[6]);
    testGraph.addEdge(nodes[4], nodes[7]);

    DotViewer view = DotViewer.displayWindow(testGraph, "MyGraph");
    SingleStepper ss = new SingleStepper("MyGrapg");

    System.out.println("BreadthFirstSearch");
    BreadthFirstSearch b = new BreadthFirstSearch(testGraph);
    b.singlestepper = ss ;
    b.start(nodes[7]);

    System.out.println("DepthFirstSearch");
    DepthFirstSearch ds = new DepthFirstSearch(testGraph) ;
    ds.singlestepper = ss ;
    ds.start(nodes[7]);


  }
}

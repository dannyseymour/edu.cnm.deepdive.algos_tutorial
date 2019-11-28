package edu.cnm.deepdive;

public class App {

  public static void main(String[] args) {
    BreadthFirstSearch bfs = new BreadthFirstSearch();
    Vertex vertex1 = new Vertex(1);
    Vertex vertex2 = new Vertex(1);
    Vertex vertex3 = new Vertex(1);
    Vertex vertex4 = new Vertex(1);
    Vertex vertex5 = new Vertex(1);
    vertex1.addNeighborVertex(vertex2);
    vertex1.addNeighborVertex(vertex4);
    vertex4.addNeighborVertex(vertex5);
    vertex2.addNeighborVertex(vertex3);
    bfs.breadthFirstSearch(vertex1);
  }
}

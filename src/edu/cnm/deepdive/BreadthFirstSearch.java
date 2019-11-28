package edu.cnm.deepdive;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
  public void breadthFirstSearch(Vertex startingVertex){
    Queue<Vertex> queue = new LinkedList<>();

    startingVertex.setVisited(true);
    while(!queue.isEmpty()){
      Vertex actual = queue.remove();
      System.out.println(actual+" ");
      for (Vertex neighbor:actual.getNeighborList()){
        if (!neighbor.isVisited()){
          neighbor.setVisited(true);
          queue.add(neighbor);
          System.out.println("Checked "+actual.toString());
        }

      }
    }
  }

}

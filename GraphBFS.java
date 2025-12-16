import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBFS {
    public static void bfsForGraph(int start, List<List<Integer>> graph)
    {
        int n=graph.size();
        Boolean[] visited=new Boolean[n];
        Queue<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.add(start);
        while(!q.isEmpty())
        {
            int node=q.poll();
            System.out.println(node);
            for(int n:graph.get(node))
            {
              if(!visited[n])
              {
                visited[n]=true;
                q.add(n);
              }
            }
        }
}
    public static void main(String[] args) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            graph.get(0).add(1);
            graph.get(0).add(2);
            graph.get(1).add(3);
            graph.get(2).add(4);
            graph.get(3).add(5);
            bfsForGraph(0, graph);
        }
    }
}
/* Pass a graph [ List<List<Integer>> graph ] and the start node of the graph as a function parameter.
Take a boolean array which will track that a node of the graph is visited or not , if visited then its value will be true,else it will be false.
As we know that queue is used for bfs, so a queue will be created.Atfirst start node will be added
to the queue and its value will be set as true. Until queue is empty, we will remove one node 
at a time from it and will print the data of it---this is when the node is visited/processed in BFS order.
Then at the last : 
for every neighbour of node - if that neighbor hasn't visited yet: 1. mark it visited immediately, 2. add it to the queue to be processed later.

*/
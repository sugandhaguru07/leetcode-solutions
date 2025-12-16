/* Apply BFS on a tree */

import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS {
    public static class Node{
         int data;
         Node left,right;
         Node(int data)
         {
            this.data=data;
            this.left=null;
            
            this.right=null;
         }
    }  
    public static void treeBFS(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n=q.poll();
            System.out.println(n.data);
            if(n.left!=null)
            {
                q.add(n.left);
            }
            if(n.right!=null)
            {
                q.add(n.right);
            }
    }
  }
  public static void main(String[] args) {
    Node root=new Node(10);
    root.left=new Node(20);
    root.right=new Node(30);
    root.left.left=new Node(40);
    root.right.right=new Node(50);
    treeBFS(root);
  }
}


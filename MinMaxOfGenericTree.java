/* 
    10
    / \
  20   30
  /\   /\
40 50 60 70
*/

import java.util.ArrayList;
import java.util.List;

public class MinMaxOfTree {   
    public static class Node{
        int data;
        List<Node> children=new ArrayList<>();
        Node(int data)
        {
           this.data=data;
        }
    }
    public static int minNode(Node n)
    {
        int minimum=n.data;
        for(Node child:n.children)
        {
           int minChild=minNode(child);
           minimum=Math.min(minChild,minimum);
        }
        return minimum;
    }
    public static int maxNode(Node n)
    {
        int maximum=n.data;
        for(Node child:n.children)
        {
            int maxChild=maxNode(child);
            maximum=Math.max(maxChild,maximum);
        }
        return maximum;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        Node n6=new Node(60);
        Node n7=new Node(70);
        root.children.add(n2);
        root.children.add(n3);
        n2.children.add(n4);
        n2.children.add(n5);
        n3.children.add(n6);
        n3.children.add(n7);
        int nodeMin=minNode(root);
        System.out.println("Minimum node:"+nodeMin);
        int nodeMax=maxNode(root);
        System.out.println("Maximum node:"+nodeMax);
    }
}

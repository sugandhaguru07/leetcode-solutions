import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversal{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }

    public static void inorderTraversal(Node node)
    {
       if(node == null) return;    
       inorderTraversal(node.left);
       System.out.println(node.data);
       inorderTraversal(node.right);
    }

    public static void preOrderTraversal(Node node)
    {
        if(node == null) return;
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void postOrderTraversal(Node node)
    {
        if(node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

    public static void levelOrderTraversal(Node node)  
    {
       if(node == null) return;
       Queue<Node> q=new LinkedList<>();
       q.add(node);
       while(!q.isEmpty())
       {
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

    /* Here atfirst we enqueue root element,dequeue it and add it in stack,
    , then we enqueue right and then left child of the dequeued node. Same process
     will be repeated until queue will not empty. Then print stack's element.
    */
    public static void reverseLevelOrderTraversal(Node node)
    {
        if(node==null) return;
        Queue<Node> q=new LinkedList<>();
        Stack<Node> st=new Stack<>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node currNode=q.poll();
            st.push(currNode);
            if(currNode.right!=null)
              q.add(currNode.right);
            if(currNode.left!=null)
              q.add(currNode.left);
        }
        while (!st.isEmpty()) {
            Node peekNode=st.peek();
            System.out.println(peekNode.data);
            st.pop();
        }
    }

    /* Zigzag/spiral order traversal
           10
          /  \
         20   30    => 10,30,20,40,50,60,70
         /\   / \   
       40 50 60  70  => st2= (20),(30)
    Here we are using two stack. 
    1.1st stack will store root node. Pop the node,print the data and push its
    children from right to left in 2nd stack.
    2. As 1st stack is empty ,so now pop peek node of stack 2, print data, push its
    children from left to right in 1st stack.
    3. When 2nd stack will be empty ,pop node from 1st stack.
    4. At the end both stack will be empty.
    */
    public static void spiralTraversal(Node node)
    {
        if(node==null) return;
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        st1.push(node);
        while (!st1.isEmpty() || !st2.isEmpty()) {
          while(!st1.isEmpty())
          {
            Node currNode=st1.pop();
            System.out.println(currNode.data);
            if(currNode.left!=null)
                st2.push(currNode.left);
            if(currNode.right!=null)
                st2.push(currNode.right);
          }
          while(!st2.isEmpty())
          {
            Node currNode=st2.pop();
            System.out.println(currNode.data);
            if(currNode.right!=null)
                st1.push(currNode.right);
            if(currNode.left!=null)
                st1.push(currNode.left);
          }
    }
}
}
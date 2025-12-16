public class TreeDFS {
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
    public static void treeDFS(Node root)
    {
        if(root==null) return;
        System.out.println(root.data);
        treeDFS(root.left);
        treeDFS(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.right.right=new Node(50);
        treeDFS(root);
    }
}

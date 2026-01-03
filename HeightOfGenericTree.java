import java.util.ArrayList;
import java.util.List;

public class HeightOfGenericTree {
    public static class Node{
        int data;
        List<Node> children=new ArrayList<>();
        Node(int data)
        {
           this.data=data;
        }
    }
    public static int heightOfTree(Node node)
    {
        int height=-1;
        if(node==null) return -1;
        for(Node children:node.children)
        {
            int childHeight=heightOfTree(children);
            height=Math.max(childHeight,height);
        }
        height=height+1;
        return height;
    }
}

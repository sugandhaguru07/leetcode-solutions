/* Merge two sorted linked lists. Output must be a sorted linked list.The time complexity should be O(m+n). */
public class MergeLinkedLists {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node mergeLists(Node l1, Node l2)
    {
        Node newList=new Node(0);   //Temporary a start node
        Node temp=newList;               //Pointer tobuild a result
        while(l1!=null && l2!=null)
        {
            if(l1.data <= l2.data)
            {
               temp.next=l1;
               l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        //Attavhing remaining nodes 
        if(l1!=null) temp.next=l1;
        if(l2!=null) temp.next=l2;
        return newList.next;
    }
    public static void main(String[] args) {
        Node n1=new Node(3);
        n1.next=new Node(6);
        n1.next.next=new Node(9);
        Node m1=new Node(2);
        m1.next=new Node(7);
        m1.next.next=new Node(8);
        m1.next.next.next=new Node(11);
        m1.next.next.next.next=new Node(13);
        m1.next.next.next.next.next=new Node(15);
        Node newList=mergeLists(n1, m1);
        System.out.println("Merged list is:");
        while(newList!=null)
        {
            System.out.println(newList.data);
            newList=newList.next;
        }
    }
}

/* If linkedlist1= 3,6,10,12 and linkedlist2= 2,7,8,15, then :
   Atfirst we create a node with data 0 and another node "temp" will point the node initially.
   Then two pointer comparison will work within the while loop and the loop will continue till 
   the last node of list1 and list2. Within this loop: we will compare the value of list1's first node and list2's first node. 1)If
   list1 is smaller then it will be included as the temp.next node, and list1 will be incremented by one node. 2)Else list2 will be 
   included as the temp.next node, and list2 will be incremented by one node.
   Atlast we are adding the remaining nodes of the lists(if a list is larger thatn another, than this will work) in the resultant list.
*/
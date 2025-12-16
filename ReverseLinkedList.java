public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
     public static Node reverseLlist(Node head)
    {
       Node prev=null;
       Node current=head;
       while(current!=null)
       {
        Node next=current.next;
        current.next=prev;
        prev=current;
        current=next;
       }
       return prev;
    }
    public static void printList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Original list:");
        printList(head);
        Node newNode=ReverseLinkedList.reverseLlist(head);
        System.out.println("Reversed linked list:");
        printList(newNode);
    }
}

/* The list is 10(head) -> 20 -> 30 -> 40 -> 50 -> null, initially prev= null, current node=head=10 ,we will reverse it by doing like this 
   In first iteration- [10 -> prev(null)]  [20 -> 30 -> 40 -> 50 ->null]
   2nd iteration- [20 -> 10 -> prev(null)] [30 -> 40 -> 50 ->null]
   .....
   Last itr. - 50->40->30->20->10->null
   The condition must be that current node must not be null to reverse the given list.
   In each itr. we will shift prev and current node to its next node. Means atfirst 
   prev=null, curr=10; then prev=10, curr=20; then prev=20, curr=30 ...
   Within the while loop, the reversal will be done by:
     1. 20 will be next node,
     2. 10 will point to prev node
     3. prev node will be the current node
     4. current node will be the next node
     Visualization: prev(null) 10(current)->20 By applying the four steps, it will be
    1st,2nd step-- prev(null)<-10   20(next)
    3rd,4th step-- null<-10(prev) 20(current)
    In each iteration these steps will be followed to reverse the whole list.
*/
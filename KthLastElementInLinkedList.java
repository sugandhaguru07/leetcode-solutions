/* If linked list is 2-4-5-7-6-3-9 and k is 3,then we have return 6.
*/
public class KthLastElementInLinkedList {
    public static class Node{
       int data;
       Node next;
       Node(int data){
           this.data=data;
       }
    }
    public static int kthLastElement(Node head, int k)
    {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=k;i++)
        {
            fast=fast.next;
        }
        slow=slow.next;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(5);
        head.next.next=new Node(3);
        head.next.next.next=new Node(6);
        head.next.next.next.next=new Node(9);
        head.next.next.next.next.next=new Node(4);
        head.next.next.next.next.next.next=new Node(8);
        int res=kthLastElement(head, 3);
        System.out.println(res);
    }
}

public class CycleInLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static boolean findCycle(Node head)
    {
         Node slow=head;
         Node fast=head;
         while(fast!=null && fast.next!=null)
         {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
         }
         return false;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        head.next=n2;
        n2.next=n3;
        n3.next=n2;
        n4.next=null;
        System.out.println("Presence of cycle:"+findCycle(head));   
    }
}
/* Linked list is 10->20->30->40->null
                         |___|
so the linked list has cycle which is 20->30->20.  We are using two variable named slow and fast and both of them are pointing to head(means 10) initially.
So it will work like this to detect the loop:
In each iteration slow will be shifted by one and fast by two. 
1st itr. -  slow=slow.next=20, fast=fast.next.next=30, and we will check whether slow and fast are equal or not (here no means no cycle)
2nd itr. - slow=30, fast=fast.next.next=30. As slow=fast so cycle presents and true will be returned.
The while condition is (fast!=null && fast.next!=null) as fast moves 2 steps ahead so we must check ahead.
So before doing fast.next.next, we must confirm that fast is not null nad fast.next is not null otherwise NullpointerException will be thrown.
*/
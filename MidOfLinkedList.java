
public class MidOfLinkedList {
    public static class Node
    {
       int val;
       Node next ;
       Node(int val)
        {
            this.val=val;
            this.next=null;
        }   
    }
    public static int midOfLinkedList(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(4);
        head.next.next=new Node(5);
        head.next.next.next=new Node(7);
        head.next.next.next.next=new Node(9);
        int res=midOfLinkedList(head);
        System.out.println(res);
    }
}

/* Here we have used two pointer approach. We have initialized slow and fast two pointer pointing to start initially.
Working way:
if array={ 1,2,3,4,5} then
step 1= slow=fast=start=1
step 2= slow=slow.next=2 and fast=fast.next.next=3
step 3= slow=slow.next=3 and fast=fast.next.next=5
Now as fast.next = null (5 is the last node in the list), so slow(3) will be returned as mid of the list.

This two pointer approach will work for both even and odd length array.

Time complexity is O(n).
*/


/*   
1-2-3-4-5-6-7-8 
11, 23, 35, 47, 5 7.next.next=null

1-2-3-4-5-6-7-8-9  
11, 23, 35, 47, 59, 9.next=null

*/
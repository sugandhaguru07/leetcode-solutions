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
    public static Node midOfLinkedList(Node start)
    {
        Node slow=start;
        Node fast=start;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node start=new Node(2);
        start.next=new Node(4);
        start.next.next=new Node(5);
        start.next.next.next=new Node(7);
        start.next.next.next.next=new Node(9);
        Node result=midOfLinkedList(start);
        System.out.println(result.val);
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
  

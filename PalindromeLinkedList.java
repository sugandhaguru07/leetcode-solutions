public class PalindromeLinkedList {
    public static class Node{
       int data;
       Node next;
       Node(int data){
        this.data=data;
       }
    }
    public static Node mid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean isPalindrome(Node head)
    {
        if(head==null || head.next==null)
            return true;
        Node mid=mid(head);
        Node firstHead=head;
        Node secondHead=reverse(mid.next);
        while(secondHead!=null){
          if(firstHead.data!=secondHead.data)
           { 
            return false;
           }
          else{
           firstHead=firstHead.next;
           secondHead=secondHead.next;
         }
        }
        return true;
    }
    public static Node reverse(Node midHead) 
    {
        Node prev=null;
        Node curr=midHead;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

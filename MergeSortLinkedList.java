public class MergeSortLinkedList {
    public static class Node{
       int data;
       Node next;
       Node(int data){
        this.data=data;
       }
    }

    public static Node findingMid(Node head)
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
    public static Node mergeSort(Node head){
       if(head==null || head.next==null)
          return head;
       Node mid=findingMid(head);
       Node head2=mid.next;
       mid.next=null;
       Node l1=mergeSort(head);
       Node l2=mergeSort(head2);
       Node res=mergeLists(l1, l2);
       return res;
    }
    // 10,20,30,40  12,15,18,24
    public static Node mergeLists(Node l1, Node l2)
    {
      Node dummy=new Node(-1);
      Node curr=dummy;
      while (l1!=null && l2!=null) {
        if(l1.data<=l2.data)
        {
             curr.next=l1;
             l1=l1.next;
        }
        else{
            curr.next=l2;
            l2=l2.next;
        }
        curr=curr.next;
      }
      if(l1!=null)
      {
        curr.next=l1;
      }
      else{
        curr.next=l2;
      }
      return dummy.next;
    }
}

/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself. */

public class LinkedListSum {
    public ListNode addNumbers(ListNode l1,ListNode l2)
    {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int val1=(l1!=null)?l1.val:0;
            int val2=(l2=null)?l2.val:0;
            sum=val1+val2+carry;
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
            if(l1!=null) l1=val.next;
            if(l2!=null) l2=val.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        LinkedListSum solution=new LinkedListSum();
        ListNode result=solution.addNumbers(l1,l2);
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
}

    

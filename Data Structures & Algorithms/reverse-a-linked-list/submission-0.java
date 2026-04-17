/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) { 
    if(head == null ||head.next==null  ){
        return head;
    }
      System.out.println(head);
      ListNode newhead = reverseList(head.next);
       System.out.println(newhead);
      head.next.next=head;
      head.next=null;
      System.out.println(head);
      
      return newhead;
    }
}

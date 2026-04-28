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
         ListNode current=new ListNode();
          ListNode next=new ListNode();
          next=null;
          current=head;

        while(current!=null){
            ListNode temp=new ListNode();
           temp=current.next;
           current.next=next;
           next=current;
           current=temp;
        }

        return next;
    }
}

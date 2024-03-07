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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next == null)
            return null;
        else if(head.next.next == null) {
            head.next = null;
            return head;
        }

        ListNode fast,slow,temp;

        fast=head;
        slow=head;
        temp=null;

        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=temp.next.next;
        slow.next=null;
        return head;
        
    }
}
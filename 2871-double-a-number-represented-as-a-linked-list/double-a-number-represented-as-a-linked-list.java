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
    public ListNode doubleIt(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode cur = head;
        while(cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        
        boolean carry = false;
        while(!stack.isEmpty()) {
            ListNode c = stack.pop();
            int val = carry ? c.val * 2 + 1 : c.val*2;
            if(val >= 10) {
                carry = true;
                val = val - 10;
            }else {
                carry = false;
            }
            c.val = val;
            
        }
        
        if(carry) {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
        
    
        
        return head;
    }
}
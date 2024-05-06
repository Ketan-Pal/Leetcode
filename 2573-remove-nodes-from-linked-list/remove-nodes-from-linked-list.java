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
    public void helper(Stack<ListNode>stack, ListNode head)
    {
        ListNode current = head;

        // Add nodes to the stack
        while (current != null) {
            stack.push(current);
            current = current.next;
        }
    }
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode>stack=new Stack<>();
        ListNode current=head;
        helper(stack, head);
        
        current=stack.pop();
        int max=current.val;
        ListNode result=new ListNode(max);
        while(!stack.isEmpty())
        {
            current=stack.pop();
            if(current.val<max)
            {
                continue;
            }
            else
            {
                ListNode newNode=new ListNode(current.val);
                newNode.next=result;
                result=newNode;
                max=current.val;
            }
        }
        return result;

    }
}
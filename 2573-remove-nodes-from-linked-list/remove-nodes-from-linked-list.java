import java.util.*;

class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        while (curr != null) {
            while (!stack.isEmpty() && stack.peek().val < curr.val) {
                stack.pop();
            }

            stack.push(curr);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (ListNode node : stack) {
            tail.next = node;
            tail = tail.next;
        }

        tail.next = null;
        return dummy.next;
    }
}
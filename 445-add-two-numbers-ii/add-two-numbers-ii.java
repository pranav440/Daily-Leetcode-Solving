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
    static ListNode reverse(ListNode head){
         ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode forward = current.next;

            current.next = prev;
            prev = current;
            current = forward;
        }

        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode anshead = new ListNode(-1);
        ListNode anstail = anshead;
        int carry = 0;
          l1 = reverse(l1);
          l2 = reverse(l2);
        while (l1 != null || l2 != null || carry != 0) {
            int sum =0;
            if(l1!=null){
               sum = sum+l1.val;
               l1 = l1.next;
            }
            if(l2!=null){
                sum = sum+l2.val;
                l2 = l2.next;
            }

             sum = sum + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            anstail.next = newNode;
            anstail = newNode;
        }
       anshead = anshead.next;
       anshead = reverse(anshead);
       return anshead;
    }
}
    
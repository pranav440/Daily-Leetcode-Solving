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
        if(head == null){
            return head;
        }
        if(head.next == null){
            return null;
        }
        ListNode prev = head;
        ListNode current = head;
        ListNode temp = null;
        while(current!=null){
            current = current.next;
            if(current!=null){
                current = current.next;
                temp = prev;
                prev = prev.next;
            }
        }
        temp.next = prev.next;
        prev.next = null;
        return head;
    }
}
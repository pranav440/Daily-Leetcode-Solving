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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode evenTail = head.next;
        ListNode evenHead = head.next;
        ListNode oddTail = head;
        ListNode oddHead = head;
        while(evenTail !=null && evenTail.next!=null){
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;
            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
        }
        oddTail.next = evenHead;
        return oddHead;
        
    }
}
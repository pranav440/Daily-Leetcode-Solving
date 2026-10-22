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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        int pos = 0;
        while(pos!=k-1){
           pos++;
           first = first.next;
        }
        ListNode second =head;
        ListNode temp = first.next;
        while(temp!=null){
            temp= temp.next;
            second = second.next;
        }
        int val = second.val;
        second.val = first.val;
        first.val = val;
        return head;
    }
}
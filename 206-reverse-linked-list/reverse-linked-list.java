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
    static ListNode reverse(ListNode prev, ListNode current){
        //base case kya hongi 
        if(current == null){
            return prev;
        }
        ListNode forward = current.next;
        current.next = prev;
        prev = current;
        current = forward;

        //recursive call

        ListNode ans = reverse(prev, current);
        return ans;
        }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; 
        ListNode current = head;
        return reverse(prev,current);
    }
}
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
    static ListNode position(ListNode head, int pos){
      int position =1;
      ListNode temp = head;
      while(temp != null && position !=pos){
        temp = temp.next;
        position++;
      }
      return temp;
      
    }

    static ListNode reverse(ListNode prev, ListNode current, ListNode last) {

    if (current == last) {
        return prev;
    }

    ListNode forward = current.next;

    current.next = prev;

    return reverse(current, forward, last);
}


   public ListNode reverseBetween(ListNode head, int left, int right) {

    ListNode left1 = position(head, left);
    ListNode right1 = position(head, right);

    ListNode beforeLeft = position(head, left - 1);
    ListNode afterRight = right1.next;

    reverse(null, left1, afterRight);

    left1.next = afterRight;

    if (beforeLeft != null) {
        beforeLeft.next = right1;
    } else {
        head = right1;
    }

    return head;
}
    
}
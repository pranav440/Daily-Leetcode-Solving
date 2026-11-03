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
      ListNode prev = null;
      ListNode current = head;
      while(current!=null){
        ListNode forward = current.next;
        current.next = prev;
        prev = current;
        current = forward;
      }
      return prev;
    }
    public ListNode doubleIt(ListNode head) {
       // 1.pehele reverse krenge
        head = reverse(head);
       //2. operation perform karenge
       ListNode temp = head;
       int carry = 0;
       ListNode prev = null;
       while(temp!=null){
        int sum = temp.val*2+carry;
        int digit = sum%10;
        carry = sum/10;
        temp.val = digit;
        prev = temp;
        temp = temp.next;
        }
        if(carry!=0){
            ListNode xtra = new ListNode(carry);
            xtra.next = null;
            prev.next = xtra;
        }
        //3. again reverse kar denge
        head = reverse(head);
        return head; 
}
}
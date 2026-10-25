/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean hascycle = false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
                slow = slow.next;
                
            }
            if(fast == slow){
                hascycle = true;
                break;
                }
        }
        if(hascycle == false){
               return null;
            }
            
        ListNode temp = slow;
        slow = head;
        while(slow!=temp){
            slow = slow.next;
            temp =  temp.next;
        }
        ListNode first = temp;
        return first;
    }
}
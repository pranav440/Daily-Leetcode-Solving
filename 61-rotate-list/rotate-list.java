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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        if(k==0){
            return head;
        }
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            count++;
            if(temp.next==null){
                break;
            }
            temp = temp.next;
        }
        int pos = k%count;
        if(pos == 0){
            return head;
        }
        temp.next = head;
       
        int pos1 = count-1-pos;
        ListNode head1 = head;
        ListNode temp1 = head;
        while(pos1-- >0){
            head1 = head1.next;
            temp1 = temp1.next;
        }
        head1 = head1.next;
        temp1.next = null;
        return head1;
    }
}
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;

        ListNode left = head1;
        for(int i=1; i<a ; i++){
           left = left.next;
        }
        ListNode right = left;
        for(int j=0; j<=b-a; j++){
          right = right.next;
        }
        right = right.next;
        left.next = head2;
        ListNode temp = head2; 
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = right;
        return head1;
    }
}
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];
        ListNode temp = head;
        int length =0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        int basesize = length/k;
        int extra = length%k;

        ListNode prev = null;
        ListNode curr = head;

        for(int index = 0; index<k ; index++){
          if(curr == null){
            arr[index] = curr;
            continue;
          }
          arr[index] = curr;
          int windowlength = basesize + (extra>0 ? 1:0);
          extra--;
          for(int i=0; i<windowlength; i++){
            prev = curr;
            curr = curr.next;
          }
          prev.next = null;
          prev=null;
        }
        return arr;
    }
}
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode current = head.next;
        int  i = 1;
        List<Integer> List = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        while(current!=null && current.next!=null){
            if(current.val<prev.val && current.val<current.next.val){
                List.add(i);
            }
            if(current.val>prev.val && current.val>current.next.val ){
                List.add(i);
            }
            prev = prev.next;
            current = current.next;
            i = i+1;
        }
        if(List.size()<2){
            return new int[]{-1,-1};
        }

        for(int z = 1; z<List.size(); z++){
          min = Math.min(min,List.get(z) - List.get(z-1));
        }

        int max = List.get(List.size()-1) - List.get(0);
        return new int[]{min,max};
    }
}
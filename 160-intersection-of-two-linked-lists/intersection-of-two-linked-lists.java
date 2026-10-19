/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB==null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a!=null && b!=null){
            a = a.next;
            b = b.next;
        }
        //agar pehele a null hogaya matlab a ki length choti hai 
        if(a == null){
        int bcount = 0;
        while(b!=null){
            bcount++;
            b = b.next;
        }
        while(bcount-- >0){
            headB = headB.next;
        }
        }
        //agar pehele b null hogaya toh b ki length choti hai 
        else{
          int Acount =0;
        while(a!=null){
            a = a.next;
            Acount++;
        }
        while(Acount-- >0){
            headA = headA.next;
        }
        
    }
    while(headA != null && headB!=null){
        if(headA == headB){
            return headA;
        }
        else{
            headA = headA.next;
            headB = headB.next;
        }
    }
    return null;
    
}
}
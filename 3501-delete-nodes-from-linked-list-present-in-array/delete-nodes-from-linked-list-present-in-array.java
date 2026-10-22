class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Remove head nodes that are in the set
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }

        // Remove remaining nodes
        ListNode current = head;
        while (current != null && current.next != null) {
            if (set.contains(current.next.val)) {
                current.next = current.next.next; // skip the node
            } else {
                current = current.next; // advance
            }
        }

        return head;
    }
}   
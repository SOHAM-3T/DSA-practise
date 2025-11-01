import java.util.*;
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> valuesToRemove = new HashSet<>();
        for (int value : nums) {
            valuesToRemove.add(value);
        }
        ListNode dummyNode = new ListNode(0, head);
        for (ListNode predecessor = dummyNode; predecessor.next != null;) {
            if (valuesToRemove.contains(predecessor.next.val)) {
                predecessor.next = predecessor.next.next;
            } else {
                predecessor = predecessor.next;
            }
        }
        return dummyNode.next;
    }
}
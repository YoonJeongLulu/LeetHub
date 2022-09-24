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
    public ListNode middleNode(ListNode head) {
        Map<Integer, ListNode> map = new HashMap();

        ListNode curr_head = head;

        int cnt = 0;
        for (int i = 0; curr_head != null; i++) {
            map.put(cnt, curr_head);
            curr_head = curr_head.next;
            cnt++;
        }

        int middle = Math.round(cnt / 2);

        return map.get(middle);
    }
}
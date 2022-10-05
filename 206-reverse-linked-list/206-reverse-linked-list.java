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
    public ListNode reverseList(ListNode head) {

        ListNode reversedNode = null;

        while(head != null){
            ListNode tmp = head;
            head = head.next;
            tmp.next = reversedNode;
            reversedNode = tmp;
        }

        return reversedNode;
    }
}
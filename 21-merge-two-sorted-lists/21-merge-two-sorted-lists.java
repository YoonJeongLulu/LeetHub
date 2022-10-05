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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode sortedNode = new ListNode();
        
        ListNode curr_head = sortedNode;
        
        if (list1 == null) curr_head.next = list2;
        if (list2 == null) curr_head.next = list1;

        while(list1 != null && list2 != null){
            if (list1.val < list2.val) {
                curr_head.next = list1;
                list1 = list1.next;
            } else{
                curr_head.next = list2;
                list2= list2.next;
            }
            
            curr_head = curr_head.next;
            System.out.println(list1);
            
            if (list1 == null) curr_head.next = list2;
            if (list2 == null) curr_head.next = list1;
        }
        return sortedNode.next;
    }
}
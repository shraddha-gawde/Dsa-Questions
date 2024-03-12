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
    public ListNode deleteMiddle(ListNode head) {
       
        if (head.next == null) {
            return null;
        }
       
        if (head.next.next == null) {
            head.next = null;
            return head;
        }
        
        ListNode slowP = head;
        ListNode fastP = head.next;
        boolean skip = true;
        
        while (fastP.next != null) {
            if (!skip) {
                slowP = slowP.next;
                skip = true;
            } 
            else {
                skip = false;
            }
            fastP = fastP.next;
        }
        slowP.next = slowP.next.next;
        return head;
    }
}
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode ans = curr;
        while(true)
        {
            ListNode save = curr.next;
            if(save == null || save.next == null)
            {
                prev.next = save;
                curr.next = prev;
                break;
            }
            prev.next = save.next;
            curr.next = prev;
            prev = save;
            curr = save.next;
        }
        return ans;
    }
}
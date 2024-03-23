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
    public void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode next = null;

        while(slow!=null)
        {

            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;


        }

        ListNode firsthf = head;
        ListNode secondhf = prev;

        while(secondhf.next!=null)
        {

            next = firsthf.next;
            prev = secondhf.next;

            firsthf.next = secondhf;
            secondhf.next=next;

            firsthf = next;
            secondhf = prev;
        }

        return ;
        
    }
}
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

    static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode newHead = reverse(head);
        ListNode t = newHead;
        ArrayList arr = new ArrayList<>();
        int max = -1;
        ListNode temp = null;

        while(t!=null){
            if(t.val>=max){
                ListNode x = new ListNode(t.val);
                x.next = temp;
                temp = x;
                max = t.val;
            }
            t = t.next;
        }

        return temp;
    }
}
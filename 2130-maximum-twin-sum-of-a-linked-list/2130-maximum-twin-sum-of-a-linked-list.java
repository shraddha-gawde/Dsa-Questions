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
    public int pairSum(ListNode head) {
    Stack<ListNode> stack=new Stack<>();
    ListNode dummy=head;
    while(dummy!=null){
        stack.push(dummy);
        dummy=dummy.next;
    }
    int max=0;
    while(stack.size()>stack.size()/2){
        max=Math.max(max,head.val+stack.pop().val);
        head=head.next;
    }
    return max;
    }
}
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = list1, temp1 = list1, curr = list1;
        a--; 
        while (temp1 != null && a-- > 0) {
            temp1 = temp1.next;
            prev = temp1;
        }
        
        temp1 = list1; 
        
        while (temp1 != null && b-- > 0) {
            temp1 = temp1.next;
            curr = temp1;
        }
        
        ListNode temp2 = list2; 
        
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        
        prev.next = list2; 
        temp2.next = curr.next; 
        
        return list1; 
    }
}
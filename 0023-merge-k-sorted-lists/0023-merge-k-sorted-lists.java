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

    ListNode merge(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode head = null, curr = head;
        ListNode curr1 = list1, curr2 = list2;
        while (curr1 != null && curr2 != null) {

            ListNode minNode = null;
            if (curr1.val < curr2.val) {
                minNode = curr1;
                curr1 = curr1.next;
            } else {
                minNode = curr2;
                curr2 = curr2.next;
            }

            if (head == null) {
                curr = head = minNode;
            } else {
                curr.next = minNode;
                curr = curr.next;
            }
        }

        if (curr1 != null) {
            curr.next = curr1;
        } else if (curr2 != null) {
            curr.next = curr2;
        }

        return head;
    }

    ListNode mergeSort(ListNode[] lists, int beg, int end) {

        if (beg == end) {
            return lists[beg];
        }

        int mid = (beg + end) / 2;
        ListNode list1 = mergeSort(lists, beg, mid);
        ListNode list2 = mergeSort(lists, mid + 1, end);
        ListNode head = merge(list1, list2);
        return head;
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }
        return mergeSort(lists, 0, lists.length - 1);
    }
}
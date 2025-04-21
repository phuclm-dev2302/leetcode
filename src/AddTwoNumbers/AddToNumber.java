package AddTwoNumbers;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nodeFake = new ListNode(0);
        ListNode current = nodeFake;
        int a = 0;

        while( l1 != null || l2 != null || a!= 0){
            int sum = a;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            a = sum/10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;
        }
        return nodeFake.next;
    }
}
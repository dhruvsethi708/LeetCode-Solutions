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
        ListNode node = head;
        ListNode prev = null;
        ListNode temp = null;
        
        
        if(head == null){
            return head;
        }
        
        while(node!=null){
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }
}
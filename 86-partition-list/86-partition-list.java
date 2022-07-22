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
    public ListNode partition(ListNode head, int x) {
        ListNode lefthead = new ListNode(0);
        ListNode righthead = new ListNode(0);
        ListNode left = lefthead;
        ListNode right = righthead;
        
        while(head!=null){
            if(head.val<x){
                left.next = head;
                left = left.next;
            }else{
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }
        right.next = null;
        
        left.next = righthead.next;
        return lefthead.next;
        
    }
}
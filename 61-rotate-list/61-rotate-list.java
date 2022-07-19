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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || k==0){
            return head; 
        }
        
        ListNode tail = head;
        int tnodes = 0;
        
        while(tail.next!=null){
            tnodes++;
            tail = tail.next;
        }
            tnodes++;

        tail.next = head;
        
        
        int rotatepoint = tnodes - k%tnodes;
        tail = head;
        
        while(rotatepoint-- > 1){
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null; 
        
        return head;
        
    }
}
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode right = slow.next;
        ListNode prev = null;
        
        while(right!=null){
            ListNode temp = right.next;
            right.next = prev;
            prev = right;
            right = temp;
        }
        
        fast = prev;
        slow = head;
        
        while(fast!=null && slow!=null){
            if(fast.val != slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
        
        

    }
}
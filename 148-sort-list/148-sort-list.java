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
    public ListNode sortList(ListNode head) {
        return mergesort(head);
    }
    
    public static ListNode mergesort(ListNode head){
                
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode slown = slow.next;
        slow.next = null;
        
        ListNode left = mergesort(head);
        ListNode right = mergesort(slown);
        
        return merge(left, right);
    }
    
    public static ListNode merge(ListNode left, ListNode right){
        ListNode newnode = new ListNode(0);
        ListNode p = newnode;
        
        while(left!=null && right!=null){
            if(left.val <= right.val){
                p.next = new ListNode(left.val);
                left = left.next;
            }else if(left.val > right.val){
                p.next = new ListNode(right.val);
                right = right.next;
            }
            p = p.next;
        }
        
        while(left!=null){
            p.next = new ListNode(left.val);
            left = left.next;
            p = p.next;
        }
        
        while(right!=null){
            p.next = new ListNode(right.val);
            right = right.next;
            p = p.next;
        }
        
        return newnode.next;
    }
    
    
}
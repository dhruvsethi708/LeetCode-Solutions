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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0){
            return null;
        }
        
        return merge(lists, 0, lists.length-1);
        
    }
    
    public ListNode merge(ListNode[] lists, int start, int end) {
        
        int mid = (start+end)/2;
        
        if(start==end) return lists[start];
        
        ListNode left = merge(lists, start, mid);
        ListNode right = merge(lists, mid+1, end);
        
        return mergesort(left, right);
    }
    
    public ListNode mergesort(ListNode l1, ListNode l2){
        
        if(l1 == null && l2 != null){
            return l2;
        }
    
        if(l1 != null && l2 == null){
            return l1;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        
        while(l1!=null && l2!=null){
            
            if(l1.val<l2.val){
                ans.next = l1;
                l1 = l1.next;
                ans = ans.next;
            }else{
                ans.next = l2;
                l2 = l2.next;
                ans = ans.next;
            }
        }
        
        while(l1!=null){
            ans.next = l1;
            l1 = l1.next;
            ans = ans.next;
        }
        
        while(l2!=null){
            ans.next = l2;
            l2 = l2.next;
            ans = ans.next;
        }
        
        return dummy.next;
    }
    
}
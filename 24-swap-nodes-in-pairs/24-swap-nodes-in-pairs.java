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
    public ListNode swapPairs(ListNode head) {
//         if(head.next.next!=null){
//             head.next.next = head.next;
//             return swapPairs(head.next);

//         }
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode node = head.next;
        head.next = node.next;
        node.next = head;
        head.next = swapPairs(head.next);
        return node;
    }
}
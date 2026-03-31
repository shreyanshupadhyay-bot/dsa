/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode slow=head;
        ListNode fast = head;
        if(head==null||head.next==null||head.next.next==null){
            return false;
        }
        // fast = fast.next.next;
        
        while(fast!=null&&fast.next!=null){
             slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
            
        }
        return false;
    }
}
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
        ListNode curr = head;
        ListNode dummy =  new ListNode(0);
        ListNode temp = dummy;
        while(curr!=null){
            temp.next= new ListNode(curr.val);
            curr=curr.next;
            temp = temp.next;
            
        }
        ListNode c=dummy.next;
        ListNode prev = null;
        while(c!=null){
            ListNode next = c.next;
            c.next=prev;
            prev= c;
            c=next;
        } 
        
        Boolean an = true;
        ListNode p1 = head;
        ListNode p2=prev;
        while(p1!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return an;
        
    }
}
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
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        ListNode temp = head;
        int size=0;
         while(temp!=null){
            temp = temp.next;
            size++;
        }
        k=k%size;
        
         temp=head;
        
        for(int l =0;l<k;l++){
           for(int i =1;i<size-1;i++){
            temp = temp.next;
        }
        ListNode curr = temp.next;
        curr.next=head;
        temp.next=null;
        head=curr;
        temp=head;
        }

        return head;
    }
}
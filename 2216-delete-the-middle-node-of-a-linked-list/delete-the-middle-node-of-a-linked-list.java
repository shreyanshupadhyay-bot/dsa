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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int id = 0;
        while(temp!=null){
            temp = temp.next;
            id++;
        }
        temp = head;
        int iid=id/2;
        if(head==null||head.next==null){
            head =null;
            return head;
        }
        for(int i=0;i<iid-1;i++){
            temp = temp.next;
        }
        temp.next=temp.next.next;
       
        return head;
    }
}

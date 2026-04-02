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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        int size =0;
        ListNode p1 = new ListNode(0);
        ListNode curr=p1;
        ListNode p2 = new ListNode(0);
        ListNode new1=p2;
        while(temp!=null&&temp.next!=null){
        new1.next=temp;
        new1 = temp;
        // size++;
        temp=temp.next;
        curr.next=temp;
        curr=temp;
        // size++
        temp=temp.next;
        }
        if(temp!=null){
            new1.next = temp;
            new1=temp;
        }
        curr.next=null;
        p1=p1.next;
        p2=p2.next;
        new1.next=p1;
        // new1=p1;
        return p2;
        


        


    }
}
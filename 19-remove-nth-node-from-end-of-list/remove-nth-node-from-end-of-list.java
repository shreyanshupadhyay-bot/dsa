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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size =0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        temp =  head;
        int res=size-n;
        if(size==0||size==1){
            head = null;
        }
        else if(res<0||res==0){
            head = temp.next;
        }
        else{
        for(int i =0;i<res-1;i++){
            temp = temp.next;
        }
        temp.next=temp.next.next;
        }
        return head;
    }
}
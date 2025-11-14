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
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail=head;
        int size=1;
        while(tail.next!=null){
            tail=tail.next;
            size++;
        }
            tail.next=head;
            int i=1;
            ListNode curr=head;
            k=k%size;
            while(i<size-k){
               curr=curr.next;
               i++;
            }
            ListNode next=curr.next;
            curr.next=null;
            return next;
    }
}
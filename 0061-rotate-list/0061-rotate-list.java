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
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        temp.next=head;
        k=k%size;
        ListNode curr=head;
        int i=1;
        while(i<size-k){
            curr=curr.next;
            i++;
        }
        ListNode next=curr.next;
        curr.next=null;
        return next;
    }
    
}
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode preLeft=dummy;
        ListNode curr=head;
        for(int i=1;i<left;i++){
            preLeft=preLeft.next;
            curr=curr.next;
        }
        ListNode currHead=curr;
        ListNode prev=null;
        ListNode next;
        for(int i=0;i<=right-left;i++){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }
        preLeft.next=prev;
        currHead.next=curr;
        return dummy.next;
      }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode node1=head, node2=head.next;
        while(node2!=null){
            if(node1.val==node2.val){
                node2=node2.next;
                node1.next=node2;
            }else {
                node1=node1.next;
                node2=node2.next;
            }
        }
        return head;
    }
}
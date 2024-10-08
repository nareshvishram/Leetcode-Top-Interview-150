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
        ListNode fast=head;
        while(n-->0)
            fast=fast.next;
        if(fast==null)
            return head.next;
        ListNode slow=head;
        System.out.println(slow.val+" "+fast.val);
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.val+" "+fast.val);
        
        slow.next=slow.next.next;
        return head;
    }

    
}
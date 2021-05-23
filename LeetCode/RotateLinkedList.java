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
        if(head == null ) return null;
        
        int length = 1;
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null){
            length += 1;
            fast = fast.next;
        }
        for(int i= length-(k%length); i>1; i--){
            slow = slow.next;
        }
        
        fast.next = head;
        head = slow.next;
        slow.next = null;
        
        return head;
    }
}


// length - (k % length) -----> Trick

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode dummy = ans ;

        ListNode it1 = l1 ;
        ListNode it2 = l2 ;
        int carry = 0 ;

        while(it1 != null && it2 != null){
            int sum = it1.val + it2.val + carry;
            int value = sum % 10 ;
            dummy.next = new ListNode(value);
            carry = sum / 10 ;

            it1 = it1.next ;
            it2 = it2.next ;
            dummy = dummy.next ;
        }

        while(it1 !=  null){
            int sum = it1.val + carry;
            int value = sum % 10 ;
            dummy.next = new ListNode(value);
            carry = sum / 10 ;

            it1 = it1.next ;
            dummy = dummy.next ;
        }

        while(it2 !=  null){
            int sum = it2.val + carry;
            int value = sum % 10 ;
            dummy.next = new ListNode(value);
            carry = sum / 10 ;

            it2 = it2.next ;
            dummy = dummy.next ;
        }

        if(carry != 0){
            dummy.next = new ListNode(carry);
        }

        return ans.next ;
    }
}
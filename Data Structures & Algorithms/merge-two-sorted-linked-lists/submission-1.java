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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1Iter = list1 ;
        ListNode list2Iter = list2 ;
        ListNode ans = new ListNode() ;
        ListNode dummy = ans ;

        while(list1Iter != null && list2Iter != null){
            if(list1Iter.val <= list2Iter.val){
                dummy.next = new ListNode(list1Iter.val);
                list1Iter = list1Iter.next ;
            }
            else{
                dummy.next = new ListNode(list2Iter.val);
                list2Iter = list2Iter.next ;
            }
            dummy = dummy.next ;
        }

        while(list1Iter != null){
            dummy.next = new ListNode(list1Iter.val);
            list1Iter = list1Iter.next ;
            dummy = dummy.next ;
        }
        while(list2Iter != null){
            dummy.next = new ListNode(list2Iter.val);
            list2Iter = list2Iter.next ;
            dummy = dummy.next ;
        }

        return ans.next ;
    }
}
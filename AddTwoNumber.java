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
        ListNode result = new ListNode(-1);
        ListNode Final_Result = result;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            int sum = l1.val+l2.val+carry;
            ListNode new_node = new ListNode(sum%10);
            result.next=new_node;
            carry = sum/10;
            l1=l1.next;
            l2=l2.next;
            result=result.next;
        }
         while(l1!=null)
        {
            int sum = l1.val+carry;
            ListNode new_node = new ListNode(sum%10);
            result.next=new_node;
            carry = sum/10;
            l1=l1.next;
            result=result.next;
        }
         while(l2!=null)
        {
            int sum = l2.val+carry;
            ListNode new_node = new ListNode(sum%10);
            result.next=new_node;
            carry = sum/10;
            l2=l2.next;
            result=result.next;
        }
        if(carry>0)
        {
            ListNode new_node = new ListNode(carry);
            result.next=new_node;
        }
        return Final_Result.next;
    }
}
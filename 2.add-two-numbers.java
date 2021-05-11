// import javax.management.ListenerNotFoundException;

// import jdk.jfr.Unsigned;

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        int m1 = 0;

        int count1 = 0;
        int count2 = 0;
        ListNode temp = l1;
        while (temp != null) {

            count1++;
            temp = temp.next;

        }
        temp = l2;
        while (temp != null) {

            count2++;
            temp = temp.next;

        }
        ListNode l3, l4;
        if (count1 > count2) {
            l3 = l1;
            l4 = l2;
        } else {
            l3 = l2;
            l4 = l1;
        }
        int sum = 0;
        temp = l4;
        while (temp != null) {
            m1 = temp.val + l3.val;
            if (m1 > 9) {
                sum = m1 % 10;
                m1 /= 10;
            }
            l3.val = m1;
            l3 = l3.next;
            l3.val += sum;
            temp = temp.next;
            sum = 0;
        }

        return l3;
    }
}

// @lc code=end

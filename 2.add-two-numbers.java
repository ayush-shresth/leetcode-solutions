// import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

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
        System.exit(0);
        int m1 = 0;
        
        int count1 = 0;
        int count2 = 0;
        ListNode l3, l4,temp = l1;
        while (temp != null) {

            count1++;
            temp = temp.next;

        }
        temp = l2;
        while (temp != null) {

            count2++;
            temp = temp.next;

        }
        if (count1 > count2) {
            l3 = l1;
            l4 = l2;
        } else {
            l3 = l2;
            l4 = l1;
        }
        int sum = 0;
        temp = l4;
        l2=l3;
        int count=0;
        while (temp != null||l3!=null) {
            sum = 0;
            m1=0;
            if(count++<=count1 && count<=count2)
            m1 = temp.val + l3.val;
            if (m1 > 9) {
                sum =m1/ 10;
                m1 = m1 % 10;
            }
            l3.val = m1;
            l3 = l3.next;
            if(l3!=null)
            l3.val += sum;
            temp = temp.next;

        }

        return l2;
    }
}

// @lc code=end

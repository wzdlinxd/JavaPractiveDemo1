package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/18 15:14
 * Description: No Description
 */

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Demo16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = list1;
        while (list2 != null) {
            int val = list2.val;
            ListNode next2 = list2.next;
            list2.next = null;
            ListNode pre = null;
            boolean isMax = true;
            list1 = head;
            while (list1 != null) {
                if (list1.val >= val) {
                    if (pre == null) {
                        list2.next = list1;
                        head = list2;
                    } else {
                        pre.next = list2;
                        list2.next = list1;
                    }
                    isMax = false;
                    break;
                }
                pre = list1;
                list1 = list1.next;
            }
            if (isMax) {
                pre.next = list2;
            }
            list2 = next2;
        }
        return head;
    }
    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode head2 = new ListNode(1);
        ListNode p4 = new ListNode(2);
        ListNode p5 = new ListNode(2);
        ListNode p6 = new ListNode(3);
        head1.next = p1;
        p1.next = p2;
        p2.next = p3;
        head2.next = p4;
        p4.next = p5;
        p5.next = p6;
        System.out.println(new Demo16().Merge(head1,head2));
    }
}

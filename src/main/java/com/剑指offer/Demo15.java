package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/18 15:06
 * Description: No Description
 */

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Demo15 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head.next;
        head.next = null;
        while (p != null) {
            ListNode next = p.next;
            p.next = head;
            head = p;
            p = next;
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
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(2);
        ListNode p2 = new ListNode(3);
        ListNode p3 = new ListNode(4);
        ListNode p4 = new ListNode(5);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        System.out.println(new Demo15().ReverseList(head).val);
    }
}

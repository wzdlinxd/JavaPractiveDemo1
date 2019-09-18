package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/18 14:38
 * Description: No Description
 */

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 */
public class Demo14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode p = head.next;
        ListNode newHead = new ListNode(head.val);
        int size = 1;
        while (p != null) {
            ListNode next = p.next;
            ListNode node = new ListNode(p.val);
            node.next = newHead;
            newHead = node;
            p = next;
            size++;
        }
        if (k <= 0 || k > size) {
            return null;
        }
        for (int i = 1; i < k; i++) {
            newHead = newHead.next;
        }
        while (true) {
            if (head.val == newHead.val) {
                break;
            }
            head = head.next;
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
        System.out.println((new Demo14().FindKthToTail(head,5)).val);
    }
}

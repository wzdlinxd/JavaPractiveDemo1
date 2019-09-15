package com.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/12 15:46
 * Description: No Description
 */
public class Demo2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode node = l3;
        ListNode pre = l3;
        int sum = 0;
        int nextNum = 0;
        while (!(l1 == null && l2 == null && nextNum == 0)) {
            if (node == null) {
                node = new ListNode(0);
                pre.next = node;
            }
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + nextNum;
            node.val = sum % 10;
            nextNum = sum / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            pre = node;
            node = node.next;
        }
        return l3;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */



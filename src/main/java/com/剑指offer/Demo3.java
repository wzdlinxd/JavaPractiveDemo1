package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/15 17:22
 * Description: No Description
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class Demo3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (listNode != null) {
            array.add(0, listNode.val);
            listNode = listNode.next;
        }
        return array;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}

package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/27 15:20
 * Description: No Description
 */

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 */
public class Demo20 {
    private Stack<Integer> head = new Stack<>();
    private Stack<Integer> min = new Stack<>();
    public void push(int node) {
        head.push(node);
        if (min.isEmpty()) {
            min.push(node);
            return;
        }
        Integer val = min.peek();
        if (val < node) {
            min.push(node);
        } else {
            min.push(val);
        }
    }

    public void pop() {
        if (!head.isEmpty()) {
            head.pop();
            min.pop();
        }

    }

    public int top() {
        return head.peek();
    }

    public int min() {
        return min.peek();
    }

}

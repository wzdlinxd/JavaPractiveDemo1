package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/1 14:38
 * Description: No Description
 */

import java.util.ArrayList;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * 1 2 3 4 5 6 \ 3 4 5 2 1 6
 */
public class Demo21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0,j = 0;
        for (i = 0; i < pushA.length; i++) {
            if (pushA[i] == popA[j]) {
                j++;
                continue;
            }
            while (!list.isEmpty() && list.get(0) == popA[j]) {
                list.remove(0);
                j++;
            }
            list.add(0, pushA[i]);
        }
        while (!list.isEmpty() && list.get(0) == popA[j]) {
            list.remove(0);
            j++;
        }
        if (i == j) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] push = new int[] {1,2,3,4,5};
        int[] pop = new int[] {4,5,3,2,1};
        new Demo21().IsPopOrder(push,pop);
    }
}

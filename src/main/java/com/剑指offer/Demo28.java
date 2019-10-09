package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/4 21:36
 * Description: No Description
 */

import java.util.HashMap;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 */
public class Demo28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : array) {
            if (map.containsKey(i)) {
                map.put(i,map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int result = 0;
        int length = array.length / 2;
        for (int i : array) {
            if (map.get(i) > length) {
                result = i;
            }
        }
        return result;
    }
}

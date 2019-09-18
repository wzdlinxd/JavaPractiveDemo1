package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/18 14:24
 * Description: No Description
 */

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Demo13 {
    public void reOrderArray(int [] array) {
        int preIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num % 2 != 0) {
                for (int j = i; j > preIndex; j--) {
                    array[j] = array[j - 1];
                }
                array[preIndex] = num;
                preIndex++;
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new Demo13().reOrderArray(new int[] {1,2,3,4,5,6,7});
    }
}

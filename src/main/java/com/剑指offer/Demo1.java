package com.剑指offer;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/15 16:29
 * Description: No Description
 */

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Demo1 {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = row == 0 ? 0 : array[0].length;
        ArrayList<Integer> notIn = new ArrayList<Integer>();
        for (int i = 0; i < row; i++) {
            if (target < array[i][0] || target > array[i][col - 1]) {
                continue;
            }
            for (int j = 0; j < col; j++) {
                if (notIn.contains(j)) {
                    continue;
                } else {
                    if (target < array[0][j] || target > array[row - 1][j]) {
                        notIn.add(j);
                    } else {
                        if (target == array[i][j]) {
                            return true;
                        }
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        new Demo1().Find(16,new int[][]{});
    }
}

package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/27 11:17
 * Description: No Description
 */

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

/**
 * ArrayList<Integer> result = new ArrayList<Integer>();
 *         int row = matrix.length;
 *         int col = row > 1 ? matrix[0].length : 0;
 *         int count = 0;
 *         int flag = 0;//0：向右，1：向左，2：向下，3：向上
 *         int i = 0, j = 0;
 *         while (count < row * col) {
 *             if (flag == 0) {
 *                 int colEnd = col - j - 1;
 * //                j += (j == 0 && i == 0) ? 0 : 1;
 *                 while (j <= colEnd) {
 *                     result.add(matrix[i][j++]);
 *                     count++;
 *                 }
 *                 flag = 2;
 *                 j--;
 *             }
 *             if (flag == 1) {
 *                 int colEnd = col - j - 1;
 *                 j--;
 *                 while (j >= colEnd) {
 *                     result.add(matrix[i][j--]);
 *                     count++;
 *                 }
 *                 flag = 3;
 *                 j++;
 *                 i--;
 *             }
 *             if (flag == 2) {
 *                 int rowEnd = col - i - 1;
 *                 i++;
 *                 while (i <= rowEnd) {
 *                     result.add(matrix[i++][j]);
 *                     count++;
 *                 }
 *                 flag = 1;
 *                 i--;
 *             }
 *             if (flag == 3) {
 *                 int rowEnd = col - i - 1;
 *                 while (i >= rowEnd) {
 *                     result.add(matrix[i--][j]);
 *                     count++;
 *                 }
 *                 flag = 0;
 *                 i++;
 *                 j++;
 *             }
 *         }
 *         return result;
 */
public class Demo19 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int row = matrix.length;
        int col = row >= 1 ? matrix[0].length : 0;
        int count = (Math.min(col,row)-1)/2+1;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < col - i; j++) {
                result.add(matrix[i][j]);
            }
            for (int k = i + 1; k < row - i; k++) {
                result.add(matrix[k][col - i - 1]);
            }
            for (int j = col - i - 2; j  >= i && row - i - 1 != i; j--) {
                result.add(matrix[row - i - 1][j]);
            }
            for (int k = row - i - 2; k > i && col - i - 1 != i; k--) {
                result.add(matrix[k][i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2 , 3, 4, 5} ,{6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
//        int[][] matrix = new int[][] {{1},{2},{3},{4},{5}};
        ArrayList<Integer> result = new Demo19().printMatrix(matrix);
        for (Integer integer : result) {
            System.out.print(integer+" ");
        }
    }
}

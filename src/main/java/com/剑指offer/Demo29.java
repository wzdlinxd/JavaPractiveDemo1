package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/9 10:54
 * Description: No Description
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,
 */
public class Demo29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (input.length < k) {
            return result;
        }
        if (input.length  == k) {
            for (int i = 0; i < input.length; i++) {
                result.add(input[i]);
            }
            return result;
        }
        int flag = input[0];
        for (int i = 1; i < input.length; i++) {
            if (flag >= input[i]) {
                result.add(input[i]);
            }
        }

        if (result.size() < k) {
            for (int i = 1; i < input.length; i++) {
                if (flag < input[i]) {
                    int temp = input[i];
                    input[i] = input[0];
                    input[0] = temp;
                }
            }
            return GetLeastNumbers_Solution(input, k);
        } else {
            int[] re = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                re[i] = result.get(i);
            }
            return GetLeastNumbers_Solution(re, k);
        }


    }

    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 1, 5, 9, 7, 8};
        ArrayList<Integer> list = new Demo29().GetLeastNumbers_Solution(a, 3);
        System.out.println(list.toString());
    }
}

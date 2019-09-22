package com.wyexam;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/21 16:04
 * Description: No Description
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] results = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] values = new int[n];
            for (int j = 0; j < n; j++) {
                values[j] = sc.nextInt();
            }

            results[i] = check(values);
        }
        for (int result : results) {
            System.out.println(result);
        }
    }
    public static int check(int[] values) {
        int length = values.length;
        int sum = 0;
        int count = 1;
        int result = 1;
        for (int i = 0; i < length; i++) {
            sum = values[i];
            count = 1;
            for (int j = i + 1; j < length; j++) {
                if (sum > values[j]) {
                    break;
                }
                count++;
                sum += values[j];
            }
            result = count > result ? count : result;
        }

        return result;
    }

}

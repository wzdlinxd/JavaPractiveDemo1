package com.wyexam;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/21 16:23
 * Description: No Description
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] results = new int[n];
        int[] values = new int[n];
        for (int j = 0; j < n; j++) {
            values[j] = sc.nextInt();
        }

        System.out.println(solution(values));

    }

    public static int solution(int[] values) {
        int length = values.length;
        int result = 0;
        int flag = 0;
        for (int i = 0; i < length - 1; i++) {
            int value = values[i];
            int temp = result;
            if (value < flag) {
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                if (value > values[j]) {
                    result += j - i;
                }
            }
            if (result == temp) {
                flag = value;
            }
        }
        return result;
    }
}

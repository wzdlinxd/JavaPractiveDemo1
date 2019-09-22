package com.txexam;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/20 20:38
 * Description: No Description
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int del = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = i;
            for (int j = i + 1; j < n; j++) {
                if (values[x] > values[j]) {
                    x = j;
                }
            }
            if (x != i) {
                int temp = values[x];
                values[x] = values[i];
                values[i] = temp;
            }
            if (values[i] - del > 0) {
                System.out.println(values[i] - del);
                del += values[i] - del;
                count++;
            } else if (values[i] - del == 0 && i == n -1) {
                System.out.println(values[i] - del);
                count++;
            }
            if (count == k) {
                break;
            }
            if (count != 5 && i == n -1) {
                i--;
            }
        }
        /*for (int i = 0; i < n; i++) {
            if (values[i] - del > 0) {
                System.out.println(values[i] - del);
                del += values[i] - del;
                count++;
            }
            if (count == 5) {
                break;
            }
        }*/

    }
}

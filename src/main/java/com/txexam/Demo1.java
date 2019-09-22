package com.txexam;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/20 20:05
 * Description: No Description
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] result = new boolean[n];
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
                String str = sc.nextLine();
                String str1 = sc.nextLine();
                if (length < 11) {
                    result[i] = false;
                } else {
                int index = 12;
                char[] chars = str1.toCharArray();
                for (int j = 0; j < length; j++) {
                    if (chars[j] == '8') {
                        index = j;
                        break;
                    }
                }
                if (length - index >= 11) {
                    result[i] = true;
                } else {
                    result[i] = false;
                }
            }
        }
        for (boolean b : result) {
            System.out.println(b ? "YES" : "NO");
        }
    }
}

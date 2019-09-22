package com.wyexam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/21 15:31
 * Description: No Description
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = null;
        int x = sc.nextInt();
        int[] sns = new int[x];
        for (int i = 0; i < x; i++) {
            sns[i] = sc.nextInt();
        }
        for (int i = 0; i < x; i++) {
            int sn = sns[i];
            result = new ArrayList<Integer>();


            int first = sn % 9;
            int count = sn / 9;
            if (first < 10 && first > 0) {
                System.out.print(first);
            }
            for (int j = 0; j < count; j++) {
                System.out.print(9);
            }
            System.out.println();
        }
    }



}

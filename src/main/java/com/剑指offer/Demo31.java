package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/12 9:26
 * Description: No Description
 */

/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class Demo31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        long i = 1;
        int count = 0;
        for (i = 0; i < n; i *= 10) {
            long front = n / i;
            long after = n % i;
            int current = (int) front % 10;
            if (current == 0) {
                 count += (front / 10) * i;
            } else if (current == 1) {
                count += (front / 10) * i + after + 1;
            } else {
                count += (front / 10 + 1) * i;
            }
        }
        return count;
    }
}

package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/18 14:04
 * Description: No Description
 */

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class Demo12 {
    public double Power(double base, int exponent) {
        double result = base;
        if (base == 0) {
            return 0.0;
        }
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent > 0) {
            for (int i = 0; i < exponent - 1; i++) {
                result *= base;
            }
        }

        if (exponent < 0) {
            result = 1;
            for (int i = 0; i < 0 - exponent; i++) {
                result /= base;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Demo12().Power(2.0,-3));
    }
}

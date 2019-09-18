package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/16 17:27
 * Description: No Description
 */

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * (隔板问题)将问题看成n个物品被分配到至多n个格子，C[n,n] = 2^n
 */
public class Demo9 {
    public int JumpFloorII(int target) {
        return (target == 0) ? 0 : 1 << (target - 1);
    }
}

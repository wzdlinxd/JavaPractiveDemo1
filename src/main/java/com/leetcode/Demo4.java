package com.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/24 17:15
 * Description: No Description
 */

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 */

/**
 * 复杂度不符合要求，log一般要用到二分法的思想
 * int[] result = new int[nums1.length + nums2.length];
 *         int i = 0, j = 0, index = 0;
 *         while (i < nums1.length && j < nums2.length) {
 *             if (nums1[i] < nums2[j]) {
 *                 result[index++] = nums1[i++];
 *             } else {
 *                 result[index++] = nums2[j++];
 *             }
 *         }
 *         if (i < nums1.length) {
 *             while (i < nums1.length) {
 *                 result[index++] = nums1[i++];
 *             }
 *         }
 *         if (j < nums2.length) {
 *             while (j < nums2.length) {
 *                 result[index++] = nums2[j++];
 *             }
 *         }
 *         int n = result.length / 2;
 *         if (result.length % 2 != 0) {
 *             return result[n];
 *         } else {
 *             return (result[n] + result[n - 1]) / 2.0;
 *         }
 */
public class Demo4 {
    //问题转换成去第k小的数，每次排除k/2个数
    //比如求第7小，先把前3小的去掉变成找第4小，求第4小，先把前2小的去掉变成找第2小，类推至找最小
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        //计算k
        //奇数算出来的数是同一个
        //偶数算出来的就是最中间的两个数
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;

        return (getKth(nums1, 0, n, nums2, 0, m, left)
                + getKth(nums1, 0, n, nums2, 0, m, left)) / 2.0;

    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1;
        int len2 = end2 - start2;

        //保证len1大于len2，方便计算
        if (len1 > len2) {
            return getKth(nums2, start2, end1, nums1, start1, end1, k);
        }
        //一个数组空了，直接拿第二个数组的第k位
        if (len1 == 0) {
            return nums2[start2 + k - 1];
        }
        //比较两个数组第k位
        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        //计算两个数组第k小的数分别是多少下标
        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;


        if (nums1[i] < nums2[j]) {
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - k / 2);
        } else {
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - k / 2);
        }
    }
}

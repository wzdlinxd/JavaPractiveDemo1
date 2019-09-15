package com.leetcode;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/12 15:49
 * Description: No Description
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Demo3 {
    public int lengthOfLongestSubstring(String s) {
        
        return 0;
    }




    public static void main(String[] args) {
        System.out.println(new Demo3().lengthOfLongestSubstring("pwwkew"));
    }
    /**
     * 超时
     * public int lengthOfLongestSubstring(String s) {
     *         char[] array = s.toCharArray();
     *         char[] result = new char[array.length];
     *         int resultIndex = 0;
     *         int arrayIndex = 0;
     *         int count = 0;
     *         for (int i = arrayIndex; i < array.length; i++) {
     *             boolean flag = true;
     *             for (int j = 0; j < result.length; j++) {
     *                 if (array[i] == result[j]) {
     *                     flag = false;
     *                 }
     *             }
     *             if (!flag) {
     *                 if (count < resultIndex) {
     *                     count = resultIndex;
     *                 }
     *                 resultIndex = 0;
     *                 arrayIndex++;
     *                 i = arrayIndex - 1;
     *                 result = new char[array.length];
     *             } else {
     *                 result[resultIndex] = array[i];
     *                 resultIndex++;
     *             }
     *         }
     *         if (count < resultIndex) {
     *             count = resultIndex;
     *         }
     *         return count;
     *     }
     */
    /**
     * 超时
     * public int lengthOfLongestSubstring(String s) {
     *         char[] array = s.toCharArray();
     *         int maxLength = array.length;
     *         for (int n = maxLength - 1; n >= 0; n--) {
     *             for (int i = 0; i < maxLength - n; i++) {
     *                 boolean flag = isRepeat(array, i, i + n);
     *                 if (!flag) {
     *                     return n + 1;
     *                 }
     *             }
     *         }
     *         return 0;
     *     }
     *
     *     public boolean isRepeat(char[] chars, int start, int end) {
     *         Set set = new HashSet();
     *         for (int i = start; i <= end; i++) {
     *             set.add(chars[i]);
     *         }
     *         return set.size() != (end - start + 1);
     *     }
     *
     */
}

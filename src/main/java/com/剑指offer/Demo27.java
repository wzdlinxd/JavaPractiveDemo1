package com.剑指offer;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/4 21:16
 * Description: No Description
 */

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Demo27 {
    ArrayList<String> strAll = new ArrayList<String>();
    public ArrayList<String> Permutation(String str) {
        if (str == null) {
            return null;
        }

        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }
        check(chars, "");
        return strAll;
    }
    private void check(ArrayList<Character> chars, String str) {
        if (chars.size() == 0) {
            if (str != "") {
                if (!strAll.contains(str)) {
                    strAll.add(str);
                }

            }
            return;
        }
        for (int i = 0; i < chars.size(); i++) {
            char temp = chars.get(i);
            chars.remove(i);
            check(chars, str + temp);
            chars.add(i, temp);
        }
    }
}

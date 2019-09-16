package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/15 16:42
 * Description: No Description
 */

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class Demo2 {
    public String replaceSpace(StringBuffer str) {
        int form = 0;
        while (true) {
            form = str.indexOf(" ", form);
            if (form == -1) {
                break;
            }
            str.replace(form, form + 1, "%20");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Demo2().replaceSpace(new StringBuffer("We Are Happy")));
    }
}

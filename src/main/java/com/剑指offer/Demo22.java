package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/1 15:49
 * Description: No Description
 */

import java.util.ArrayList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Demo22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        list.add(root);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                result.add(list.get(i).val);
                list.add(list.get(i).left);
                list.add(list.get(i).right);
            }

        }
        return result;
    }
}

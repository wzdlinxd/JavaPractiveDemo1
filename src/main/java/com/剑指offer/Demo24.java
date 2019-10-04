package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/2 17:59
 * Description: No Description
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class Demo24 {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return result;
        }
        target -= root.val;
        if (target < 0) {
            return result;
        }
        list.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        if (list.size() == 1) {
            Collections.sort(result, new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    if (o1.size() < o2.size()) {
                        return 1;
                    } else if (o1.size() > o2.size()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(1);
        root.left = t1;
        root.right = t2;
        t2.right = t3;
        ArrayList<ArrayList<Integer>> arrayLists = new Demo24().FindPath(root, 3);
        System.out.println(arrayLists);
    }
}

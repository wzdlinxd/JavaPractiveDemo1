package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/4 18:56
 * Description: No Description
 */

import sun.reflect.generics.tree.Tree;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Demo26 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        TreeNode temp = change(pRootOfTree);
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
    private TreeNode change(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        pRootOfTree.left = change(pRootOfTree.left);
        TreeNode temp = change(pRootOfTree.right);
        while (temp != null && temp.left != null) {
            temp = temp.left;
        }
        pRootOfTree.right = temp;
        if (pRootOfTree.left != null) {
            pRootOfTree.left.right = pRootOfTree;
        }
        if (pRootOfTree.right != null) {
            pRootOfTree.right.left = pRootOfTree;
        }
        pRootOfTree = pRootOfTree.right != null ? pRootOfTree.right : pRootOfTree;

        return pRootOfTree;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        TreeNode n1 = new TreeNode(6);
        TreeNode n2 = new TreeNode(10);
        /*TreeNode n3 = new TreeNode(9);
        TreeNode n4 = new TreeNode(2);*/
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(7);
        TreeNode n7 = new TreeNode(9);
        TreeNode n8 = new TreeNode(11);
        root1.left = n1;
        root1.right = n2;
        n1.left = n5;
        n1.right = n6;
        n2.left = n7;
        n2.right = n8;
        TreeNode result = new Demo26().Convert(root1);
        System.out.println("end");
    }
}

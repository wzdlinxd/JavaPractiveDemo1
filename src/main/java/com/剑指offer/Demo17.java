package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/18 16:19
 * Description: No Description
 */

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Demo17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = check(root1, root2);
            }
            if (!result) {
                result = HasSubtree(root1.left,root2);
            }
            if (!result) {
                result = HasSubtree(root1.right,root2);
            }
        }
        return result;

    }
    public boolean check(TreeNode root1,TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return check(root1.left, root1.left) && check(root1.right, root1.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        TreeNode root2 = new TreeNode(8);
        TreeNode n1 = new TreeNode(8);
        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(9);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(9);
        TreeNode n6 = new TreeNode(2);
        TreeNode n7 = new TreeNode(4);
        TreeNode n8 = new TreeNode(7);
        root1.left = n1;
        root1.right = n2;
        root2.left = n3;
        root2.right = n4;
        n1.left = n5;
        n1.right = n6;
        n6.left = n7;
        n6.right = n8;
        System.out.println(new Demo17().HasSubtree(root1,root2));
        /*TreeNode root1 = new TreeNode(8);
        TreeNode root2 = new TreeNode(8);
        TreeNode n1 = new TreeNode(9);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(9);
        TreeNode n4 = new TreeNode(2);
        TreeNode n6 = new TreeNode(2);
        TreeNode n7 = new TreeNode(8);
        root1.left = n1;
        root1.right = n2;
        root2.left = n3;
        root2.right = n4;
        n1.left = n6;
        n1.right = n7;
        n3.left = n6;
        n3.right = n7;

        System.out.println(new Demo17().check(root1,root2));*/
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
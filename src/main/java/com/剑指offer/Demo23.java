package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/10/1 22:10
 * Description: No Description
 */


/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Demo23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        return verify(sequence, 0 , sequence.length, 1) ? true :
                 verify(sequence, 0 , sequence.length, 0);
    }
    private boolean verify(int[] sequence, int start, int end, int flag) {
        if (end - start < 3) {
            return true;
        }

        for (int i = start + 1; i < end; i++) {
            boolean isVerify = true;
            int temp = sequence[end - 1];//右边最小值
            for (int j = start; j < i; j++) {
                if (flag == 1) {
                    if (sequence[j] > temp) {
                        isVerify = false;
                        break;
                    }
                }
                if (flag == 0) {
                    if (sequence[j] < temp) {
                        isVerify = false;
                        break;
                    }
                }
            }
            for (int j = i; j < end - 1; j++) {
                if (flag == 1) {
                    if (sequence[j] < temp) {
                        isVerify = false;
                        break;
                    }
                }
                if (flag == 0) {
                    if (sequence[j] > temp) {
                        isVerify = false;
                        break;
                    }
                }
            }
            if (isVerify) {
                if (verify(sequence, start, i,flag)
                        && verify(sequence, i, end - 1,flag)) {
                    return true;
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        System.out.println(new Demo23().VerifySquenceOfBST(a));
    }
}

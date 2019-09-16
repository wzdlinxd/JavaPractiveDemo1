package com.剑指offer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/9/15 22:45
 * Description: No Description
 */

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Demo6 {
    public int minNumberInRotateArray(int [] array) {
        int[] arr = array;
        if (arr == null || arr.length < 1){
            return 0;
        }
        int res = arr[0];
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                res = arr[i+1];
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Demo6().minNumberInRotateArray(new int[]{3,4,5,1,2}));
    }
}

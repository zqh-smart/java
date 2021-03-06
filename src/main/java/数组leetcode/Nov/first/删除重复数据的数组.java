package 数组leetcode.Nov.first;

import java.util.Scanner;

/*
给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
* 输入：nums = [1,1,2]
输出：2, nums = [1,2]
解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
* */
public class 删除重复数据的数组 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(arr);
        System.out.println(result);
        for (int i = 0; i < result; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int fast = 1, slow = 1;
        if (n == 0)
            return 0;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
